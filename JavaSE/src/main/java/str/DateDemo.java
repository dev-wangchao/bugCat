package str;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.stream.IntStream;

public class DateDemo {

    public static void main(String[] args) {

        System.out.println("Java8 版工作日 = " + java8WorkDays());        // 28

    }


    // 计算「今天」到「下一个发薪日（每月 5 号）」的工作日天数（排除周末）
    private static long java8WorkDays() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime pay = now.withDayOfMonth(5);
        if (pay.isBefore(now)) {
            pay = pay.plusMonths(1);
        }
        int between = (int) ChronoUnit.DAYS.between(now, pay);
        return IntStream.range(0, between)
                .mapToObj(now::plusDays)
                .filter(day -> day.getDayOfWeek() != DayOfWeek.SATURDAY && day.getDayOfWeek() != DayOfWeek.SUNDAY)
                .count();
    }




}

package thread;

public class Test01 {


    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();

        Thread zhangsan = new Thread(myTicket, "张三");
        Thread lisi = new Thread(myTicket, "李四");
        Thread wangwu = new Thread(myTicket, "王五");

        zhangsan.start();
        lisi.start();
        wangwu.start();
    }
}

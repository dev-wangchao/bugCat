package str;

public class UserRegistrationSystem {

    // 用户名校验：去空格、首字母大写、长度校验
    private static String validateUsername(String username) {
        String trimmed = username.trim();
        if (trimmed.isEmpty() || trimmed.length() > 20) {
            throw new IllegalArgumentException("长度不符合");
        }
        return username.substring(0, 1).toUpperCase() + username.substring(1).toLowerCase();
    }

    // 邮箱校验：格式检查、转小写
    private static String validateEmail(String email) {
        String replaced = email.replaceAll("\\s+", "");
        if (!replaced.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$")) {
            throw new IllegalArgumentException("非法邮箱");
        }
        return email.toLowerCase();
    }

    // 电话号码格式化：去除非数字字符、添加分隔符
    private static String formatPhoneNumber(String phone) {
        String replaced = phone.replaceAll("[^0-9]", "");
        return replaced.substring(0, 3) + "-"
                + replaced.substring(3, 7) + "-"
                + replaced.substring(7);
    }
}

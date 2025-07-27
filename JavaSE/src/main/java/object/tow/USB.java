package object.tow;

public interface USB {

    // 接口成员变量
    public static final int MIN = 1;
    int MAX = 100;

    // 接口抽象方法
    public abstract void open();
    String close();

    // 接口默认方法，选择性重写
    // 调用方法：USB.super.pay()
    public default void pay() {
        System.out.println("interface pay");
    }

    // 接口直接调用
    static String getName() {
        return "HUAWEI";
    }
}

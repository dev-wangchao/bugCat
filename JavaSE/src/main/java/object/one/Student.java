package object.one;

public class Student {
    static String classRoom = "admin";

    static {
        // 常用于初始化静态资源，加载配置文件，注册驱动等
        System.out.println("只在类的首次加载时触发~~~~~~~");
        System.out.println("静态初始化块，类加载的最后一步初始化执行！！！");
    }

    static void printName() {
        System.out.println("静态方法在类加载阶段初始化------");
    }
}
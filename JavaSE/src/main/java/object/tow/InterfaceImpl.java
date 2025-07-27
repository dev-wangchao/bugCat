package object.tow;

public class InterfaceImpl implements InterfaceA, InterfaceB{
    @Override
    public void method() {
        System.out.println("我是重写的method方法");
//        InterfaceA.super.method();
        InterfaceB.super.print();
    }

}
package object.tow;

public interface InterfaceB {
    public abstract void method();


    default void print() {
        System.out.println("interfaceB");
    }
    //public abstract void method(int num);
}
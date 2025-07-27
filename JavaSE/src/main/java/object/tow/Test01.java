package object.tow;

public class Test01 {
    public static void main(String[] args) {
        //多态方式
        Fu fu = new Zi();
        System.out.println(fu.num);
        fu.show();

        boolean isInstanceof = fu instanceof Fu;

//        Zi instanceof Fu;

    }
}
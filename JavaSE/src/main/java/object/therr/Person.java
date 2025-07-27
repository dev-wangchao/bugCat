package object.therr;

public class Person {

    private String name;
    public String pass;

    // 静态内部类
    static class StaticHeart {
        private String HeartName;

        public void jump() {
            System.out.println("心脏跳动~~~~~~");
        }

    }

    //非静态内部类
    class Heart {
        public void jump() {
            String personName = Person.this.name;
            System.out.println("心脏跳动！！！！" + personName);
        }
    }

}

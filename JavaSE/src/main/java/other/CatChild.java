package other;

import object.one.Cat;

public class CatChild extends Cat {

    public CatChild() {
    }

    public void print() {
        Cat cat = new Cat();
//        cat.age
        String age1 = super.age;
        System.out.println(age1);
    }
}

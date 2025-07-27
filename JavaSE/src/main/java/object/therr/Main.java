package object.therr;

public class Main {

    public static void main(String[] args) {
        Person.StaticHeart staticHeart = new Person.StaticHeart();
        staticHeart.jump();

        Person.Heart heart = new Person().new Heart();
        heart.jump();
    }
}

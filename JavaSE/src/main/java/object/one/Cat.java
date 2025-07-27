package object.one;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat {

    private String name;
    protected String age;


    public Cat() {
    }

    public void print() {
        System.out.println("Cat");
    }

}

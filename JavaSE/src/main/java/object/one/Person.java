package object.one;

import lombok.Data;

@Data
public class Person {

    private String name;
    private String password;
    private Integer age;
    private Integer sex;

    private Person(Builder builder) {
        this.name = builder.name;
        this.password = builder.password;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String password;
        private Integer age;
        private Integer sex;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder sex(Integer sex) {
            this.sex = sex;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}

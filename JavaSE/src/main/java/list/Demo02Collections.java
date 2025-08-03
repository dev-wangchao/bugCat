package list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo02Collections {
    public static void main(String[] args) {
        Set<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("1", 2));
        hashSet.add(new Person("1", 2));
        hashSet.add(new Person("3", 2));
        System.out.println(hashSet);
        Set<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person("1", 2));
        linkedHashSet.add(new Person("2", 2));
        linkedHashSet.add(new Person("3", 2));
        System.out.println(linkedHashSet);

        Person p1 = new Person("1", 2);
        Person p2 = new Person("1", 2);
        Person p3 = new Person("2", 2);
        System.out.println(p1.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(p3.hashCode());
        
    }
}

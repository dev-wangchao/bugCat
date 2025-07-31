package str;


import java.io.UnsupportedEncodingException;

public class Demo02String {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "abc";
        String s2 = "ABc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
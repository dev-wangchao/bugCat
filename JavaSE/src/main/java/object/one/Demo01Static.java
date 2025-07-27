package object.one;

public class Demo01Static {
    public static void main(String[] args) {
        //调用静态成员-> 类名直接点
        Student student = new Student();
        System.out.println(student);
        System.out.println(Student.classRoom);
        System.out.println("--------------");
        Student.printName();

        System.out.println("***************");
        Student stu = new Student();
    }
}
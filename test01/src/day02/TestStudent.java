package day02;

import java.util.zip.ZipOutputStream;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        System.out.println(s1.getName());
        System.out.println(s1.get_age());
        s1.show();
        System.out.println("____________________");
        Student s2 = new Student("李四", -23);
        System.out.println(s2.getName());
        System.out.println(s2.get_age());
        s2.show();
    }
}

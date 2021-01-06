package day03;

public class LearnString {
    public static void main(String[] args) {
        /*
        java程序中,所有的双引号字符串都是String这个类的对象
        字符串时常量,它们的值在创建后不可更改
        */
        String s1 = "abcdef";
        int length = s1.length();
        System.out.println(length);
        s1 = "hij";
        System.out.println(s1);//这一步是让s1记录了一个新的对象
    }
}

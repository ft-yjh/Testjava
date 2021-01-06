package day03;

public class StringCmp {
    public static void main(String[] args) {
        //比较字符串内容
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        //不区分大小写
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}

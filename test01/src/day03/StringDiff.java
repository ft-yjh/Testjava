package day03;

public class StringDiff {
    public static void main(String[] args) {
        /*
        双引号创建的对象在字符串常量池中存储,
        通过构造方法创建的对象在堆内存中存储

        */
        //地址相同
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        char [] ch = {'a','b','c'};
        //地址不同
        String s3 = new String(ch);
        String s4 = new String(ch);
        System.out.println(s3 == s4);
    }
}

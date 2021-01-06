package day03;

public class StringBuilderConstruct {
    public static void main(String[] args) {
        //String内容不可变,StringBuilder内容可改变
        /*//public StringBuilder()创建一个空白可变字符串对象,不含任何内容
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        //根据字符串内容，创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);*/
        StringBuilder sb = new StringBuilder();
        sb.append("yang").append("景").append('h');//可追加任何内容
        System.out.println("反转前: " + sb);
        sb.reverse();
        System.out.println("反转后: " + sb);
        System.out.println("sb中字符的个数: " + sb.length());
        String s = sb.toString();//转换为String类型的字符串
        System.out.println("String类型的字符串: " + s);


    }
}

package day03;
import java.sql.SQLOutput;
import java.util.Scanner;
public class LearnScanner {
    public static void main(String[] args) {
        /*
        键盘录入字符串
        next方法和nextLine的区别:
        next(): 在录入数据的时候,遇到空格,就不再录入了
                *以空格作为录入的结束标志
        nextLine(): 将数据完整接收过来
                *以回车换行作为录入的结束标志
        */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String s1 = sc.next();
        System.out.println(s1);
        System.out.println("请输入: ");
        String s2 = sc.nextLine();
        System.out.println(s2);*/
        //在录入字符串之前录入一个整数
        /*
        弊端:
        next(): 录入数据的时候,可能会丢失数据
        nextLine():在调用该方法之前,如果调用过nextInt方法,nextLine将缺少录入的机会
        解决方法:
        同时录入整数与字符串时
        1.字符串先于整数录入(nextLine)
        2.使用next()录入
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("请输入: ");
        String s = sc.nextLine();
        System.out.println(s);
    }


}

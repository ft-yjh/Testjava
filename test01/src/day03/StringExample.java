package day03;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        //对称字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();
        //System.out.println(sb);
        if (s.equals(s2))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}

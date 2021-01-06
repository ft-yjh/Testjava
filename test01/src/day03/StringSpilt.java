package day03;

import java.util.Scanner;

public class StringSpilt {
    //字符串切割
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String scInfo = sc.nextLine();
        String [] st = scInfo.split(",");
        System.out.println(st[0]);
        System.out.println(st[1]);
    }
}

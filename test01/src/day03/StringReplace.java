package day03;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String s = sc.nextLine();
        String rs = s.replace("TMD","***");
        System.out.println(rs);
    }
}

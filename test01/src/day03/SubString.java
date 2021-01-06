package day03;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String telString = sc.nextLine();

        String start = telString.substring(0,3);
        String end = telString.substring(7);
        System.out.println(start + "****" + end);
    }
}

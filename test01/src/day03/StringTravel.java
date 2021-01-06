package day03;

import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class StringTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        /*第一种
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++)
        {
            System.out.println(s1.charAt(i));
        }*/
        //第二种
        String s2 = sc.nextLine();
        char [] ch = s2.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}

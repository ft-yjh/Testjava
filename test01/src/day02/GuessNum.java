package day02;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class GuessNum {
        public static void main(String [] args)
        {

            //猜数字
            Random r = new Random();
            int num = r.nextInt(100) + 1;// 0 - 100
            System.out.println(num);
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                System.out.println("请输入如你要猜的数字: ");
                int guessNum = sc.nextInt();
                if (num > guessNum)
                    System.out.println("猜小了");
                else if(num < guessNum)
                    System.out.println("猜大了");
                else
                {
                    System.out.println("猜对了");
                    break;
                }
            }



        }
    }


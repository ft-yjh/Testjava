package day05;
import java.util.Arrays;
import java.util.Random;
public class MyArrays {
    public static void main(String[] args) {
        //将一个随机字符串中的所有字符升序排列,并倒序输出
        String s = "3";
        Random ran = new Random();
        for (int i = 0; i < 9; i++)
        {
            char ch = (char)(ran.nextInt(66) + 50);
            s += ch;
        }
        System.out.println(s);
        char[] chars = s.toCharArray();
        //Arrays里面好多静态方法,直接用类名调用
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
}

package day05;

public class MathUse {
    public static void main(String[] args) {
        //计算-10.8->5.9之间绝对值大于6或小于2.1之间的整数
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (int i = (int)min; i < max; i++)
        {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1)
            {
                System.out.println(i);
                count++;
                System.out.println("总共数量为: " + count);
            }
        }
    }
}

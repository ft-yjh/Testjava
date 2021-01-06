package day03;

public class LearnStringBuilder {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);

        StringBuilder sb = new StringBuilder();//提高字符串的操作效率
        for (int i = 1; i <= 50000; i++)
        {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);//20

    }
    public void method()
    {
        long start = System.currentTimeMillis();//1970年到现在的毫秒值
        System.out.println(start);
        String s = "";
        for (int i = 1; i <= 50000; i++)
        {
            s +=  i;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end - start);//2000
    }
}

package day03;

public class StringConstruct {
    public static void main(String[] args) {
        /*
        *注意: String这个类比较特殊,打印对象名的时候,不会出现内存地址
        * 而是对象所记录的真实内容
        */
        //public String(): 创建一个空白字符串对象,不含有任何内容
        String s1 = new String();
        System.out.println(s1);

        //public String(char[] chs):根据字符串的内容,来创建字符串对象
        char [] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);

        //根据传入的字符串内容来创建对象
        String s3 = new String("123");
        System.out.println(s3);

        //直接赋值,创建对象
        String s4 = "456";
        System.out.println(s4);
    }
}

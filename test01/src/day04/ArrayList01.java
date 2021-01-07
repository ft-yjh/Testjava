package day04;
import java.util.ArrayList;
public class ArrayList01 {
    public static void main(String[] args) {
        //ArrayList<E>是可调整大小的数组实现
        //<E>是一种特殊的数据类型,泛型
        ArrayList<String> list = new ArrayList<>();
//        list.add("abc");
//        list.add(111);
//        list.add('c');
        list.add("111");
        list.add("222");
        list.add("333");
        list.add(0,"444");

        System.out.println(list);
    }
}

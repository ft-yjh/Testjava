package day04;

import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        //testRemove();
        testSet();
    }

    public static void testSet()
    {
        ArrayList<String>list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        System.out.println(list);
        //将索引处的元素修改,返回被修改的元素
        System.out.println(list.set(0,"cba"));
        System.out.println(list);
        //ArrayList的遍历
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));//获取索引处的元素
        }

    }
    public static void testRemove()
    {
        ArrayList<String>list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        //根据元素删除,返回是否删除成功
        System.out.println(list.remove("111"));
        System.out.println(list.remove("ccc"));
        System.out.println(list);
        //根据索引删除,返回删除的元素
        System.out.println(list.remove(3));
        System.out.println(list);

    }

}

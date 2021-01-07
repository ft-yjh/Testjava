package day04;
import java.util.ArrayList;
public class ArrayList03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("test".equals(s))//****细节******
            {
                list.remove(i);
                i--;//*****细节******
            }

        }
        System.out.println(list);
    }
}

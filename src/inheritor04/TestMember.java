package inheritor04;

import java.util.ArrayList;

public class TestMember {
    public static void main(String[] args) {
        Host h = new Host("群主", 100);
        Member m1 = new Member("成员A", 0);
        Member m2 = new Member("成员B", 0);
        Member m3 = new Member("成员C", 0);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = h.send(20, 3);
        m1.receive(list);
        m2.receive(list);
        m3.receive(list);
        h.show();
        m1.show();
        m2.show();
        m3.show();
    }
}

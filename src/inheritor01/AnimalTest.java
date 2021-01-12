package inheritor01;

import javax.sound.midi.Soundbank;

public class AnimalTest {
    public static void main(String[] args) {
        Mouse mou = new Mouse();
        mou.set("老鼠", "公的", 3, "麦子");
        mou.burrow();
        mou.show();
        System.out.println("++++++++++++");
        Dog d = new Dog();
        d.set("狗", "母的", 4,"面条");
        d.watch();
        d.show();
        System.out.println("++++++++++++");
        Pig p = new Pig();
        p.set("猪", "公的",5,"糠");
        p.snore();
        p.show();
    }
}

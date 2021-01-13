package inheritor01;

import javax.sound.midi.Soundbank;

public class AnimalTest {
    public static void main(String[] args) {
        Mouse mou = new Mouse("老鼠", "公的", 3, "麦子");
        //mou.set();
        mou.use();
        mou.show();
        System.out.println("++++++++++++");
        Dog d = new Dog("狗", "母的", 4,"面条");
        //d.set();
        d.use();
        d.show();
        System.out.println("++++++++++++");
        Pig p = new Pig("猪", "公的",5,"糠");
        //p.set();
        p.use();
        p.show();
    }
}

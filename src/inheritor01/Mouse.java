package inheritor01;

public class Mouse extends Animal{
    public Mouse(String name, String sex, int age, String food)
    {
        super(name, sex,age, food);
    }
    public void use() {
        System.out.println("挖洞");
    }
}

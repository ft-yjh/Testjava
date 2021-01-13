package inheritor01;

public class Pig extends Animal{
    public Pig(String name, String sex, int age, String food)
    {
        super(name, sex,age, food);
    }
    public void use()
    {
        System.out.println("打呼噜");
    }
}

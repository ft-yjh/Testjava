package inheritor01;

public class Dog extends Animal {
    public Dog(String name, String sex, int age, String food)
    {
        super(name, sex,age, food);
    }
    public void use()
    {
        System.out.println("看门");
    }
}

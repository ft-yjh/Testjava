package inheritor03;

public class Person {
    /*public Person()
    {
        System.out.println("person");
    }*/
    //子类创建对象时，必须先初始化该对象的父类内容，
    //若父类中不存在默认无参构造，须手动调用父类其它构造。
    public Person(String s)
    {
        System.out.println("Person");
    }
    public void override()
    {

    }
}

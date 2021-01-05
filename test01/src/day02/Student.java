package day02;

public class Student {
    private String _name;
    private int _age;

    Student()
    {
        System.out.println("这是一个无参的构造方法");
    }
    Student(String name, int age)
    {
        System.out.println("这是一个有参的构造方法");
        this._name = name;
        if (age > 0 && age < 120)
        {
            this._age = age;
        }
        else
            System.out.println("输入年龄有误");
    }

    public void setName(String name)
    {
        this._name = name;
    }
    public void setAge(int age)
    {
        if (age > 0 && age < 120)
        {
            this._age = age;
        }
        else
            System.out.println("输入年龄有误");
    }
    public String getName()
    {
        return this._name;
    }
    public int get_age()
    {
        return this._age;
    }
    public void show()
    {
        System.out.println(this._name + "..." + this._age);
    }

}

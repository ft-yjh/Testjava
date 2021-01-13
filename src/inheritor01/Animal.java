package inheritor01;

import java.sql.SQLOutput;


/*
* 抽象方法就是加上abstract关键字,直接分号结束
* 抽象类,抽象方法所在的类,必须是抽象类才行,在class前写上abstract即可
* 抽象方法和抽象类的使用:
* 1.不能直接创建抽象类的对象
* 2.必须用一个子类来继承抽象父类
* 3.子类必须覆盖重写抽象父类当中所有的抽象方法
* 覆盖重写
* 4.创建子类对象进行使用
*
*
*
* */

public abstract class Animal {
    private String _name;
    private String _sex;
    private int    _age;
    private String _food;

    public Animal(String name, String sex, int age, String food)
    {
        this._name = name;
        this._sex = sex;
        this._age = age;
        this._food = food;
    }
    public abstract void use();
    //public abstract void eat();
    /*public void set(String name, String sex, int age, String food)
    {
        this._name = name;
        this._sex = sex;
        this._age = age;
        this._food = food;
    }*/
    public void show()
    {
        System.out.println("一头" + _age + "岁的" + _sex +
                _name + "正在吃" + _food);
    }
}

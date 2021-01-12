package inheritor01;

import java.sql.SQLOutput;

public class Animal {
    String _name;
    String _sex;
    int    _age;
    String _food;
    public void set(String name, String sex, int age, String food)
    {
        this._name = name;
        this._sex = sex;
        this._age = age;
        this._food = food;
    }
    public void show()
    {
        System.out.println("一头" + _age + "岁的" + _sex +
                _name + "正在吃" + _food);
    }
}

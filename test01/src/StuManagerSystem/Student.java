package StuManagerSystem;

public class Student {
    private String _num;
    private String _name;
    private int _age;
    private String _birthday;

    Student()
    {

    }
    Student(String num, String name, int age, String birthday)
    {
        this._num = num;
        this._name = name;
        this._age = age;
        this._birthday = birthday;
    }

    public  String getNum()
    {
        return _num;
    }
    public  String getName()
    {
        return _name;
    }
    public  int getAge()
    {
        return _age;
    }
    public  String getBirth()
    {
        return _birthday;
    }
}

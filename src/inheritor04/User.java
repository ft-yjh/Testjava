package inheritor04;

public class User {
    private String _name;
    private int    _money;
    public User(String name, int money)
    {
        this._name = name;
        this._money = money;
    }

    public String getName()
    {
        return _name;
    }
    public void set_money(int money)
    {
        this._money = money;
    }

    public int getMoney()
    {
        return _money;
    }

    public  void show()
    {
        System.out.println(this._name + this._money + "元");
    }

}

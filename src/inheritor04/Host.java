package inheritor04;

import java.util.ArrayList;

public class Host extends User {
    public Host(String name, int money)
    {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int money = super.getMoney();//this.getMoney();
        if (money < totalMoney)
        {
            System.out.println("余额不足");
            return list;
        }
        int perMoney = totalMoney / count;
        int leaveMoney = totalMoney % count;
        for (int i = 0; i < count - 1; i++)
        {
            list.add(perMoney);
        }
        list.add(perMoney + leaveMoney);
        this.set_money(money - totalMoney);
        return list;
    }
}

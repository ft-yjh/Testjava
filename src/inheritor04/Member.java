package inheritor04;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name, int money)
    {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list)
    {
        int index = new Random().nextInt(list.size());
        int moneyIndex = list.remove(index);
        this.set_money(moneyIndex + this.getMoney());
    }
}

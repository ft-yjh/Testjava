package inheritor03;

public class Worker extends Person{
    public Worker()
    {
        super("1");
       // 2. 子类构造方法的第一行，隐含语句super()，用于调用父的类默认无参构造
        System.out.println("worker");
    }
    //子类方法访问权限不能小于父类方法
    public void override()
    {

    }
}

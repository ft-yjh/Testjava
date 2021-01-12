package inheritor02;

public class NewPhone extends Phone {
    int num = 20;
    public void method()
    {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void show()
    {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}

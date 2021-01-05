package day01;

public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "huawei";
        p.price = 2999;
        System.out.println(p.brand + "..." + p.price);
        p.call("curry");
        p.send();
        Phone p2 = p;//指向同一内存空间
        p2.brand = "xiaomi";
        System.out.println(p.brand + " " +p2.brand);
        p2.brand = null;
//        System.out.println(p.brand);
//        System.out.println(p2.brand);
    }
}

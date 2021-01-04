public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        stu.age = 20;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.Study();
        System.out.println(stu);
    }
}

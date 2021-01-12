package StuManagerSystem;

import java.awt.image.LookupOp;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        lo:
        while (true) {
            System.out.println("欢迎来到学生管理系统!");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出系统");
            System.out.println("请选择: ");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    //System.out.println("添加学生");
                    addStu(list);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    removeStu(list);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    modifyStu(list);
                    break;
                case "4":
                    //System.out.println("查看学生");
                    PrintStu(list);
                    break;
                case "5":
                    System.out.println("欢迎使用!");
                    break lo;
                default:
                    System.out.println("您的输入有误!");
            }

        }

    }

    private static void modifyStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生编号: ");
        String num = sc.next();
        int index = getNum(list, num);
        if (index == -1)
        {
            System.out.println("未找到要修改的学生");
        }
        else
        {
            System.out.println("请输入要修改的学生姓名: ");
            String name = sc.next();
            System.out.println("请输入要修改的学生年龄: ");
            int age = sc.nextInt();
            System.out.println("请输入要修改的学生生日: ");
            String birth = sc.next();
            Student stu = new Student(num, name,age, birth);
            list.set(index, stu);
            System.out.println("修改成功!");
        }
    }

    private static void removeStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号: ");
        String num = sc.next();
        int index = getNum(list, num);
        if (index == -1)
        {
            //不存在
            System.out.println("未找到要删除的学生!");
        }
        else
        {
            //找到了
            list.remove(index);
            System.out.println("删除成功!");
        }

    }

    public static void PrintStu(ArrayList<Student> list) {
        if (list.size() == 0)
        {
            System.out.println("记录为空");
        }
        else
        {
            System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getNum() + "\t" + stu.getName()
                        + "\t" + stu.getAge() + "\t" + stu.getBirth());
            }
        }
    }

    public static void addStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String num;
        while (true)
        {
            System.out.println("请输入学号: ");
             num = sc.next();
             int index = getNum(list, num);
             if (index == -1)
                 break;

        }

        System.out.println("请输入姓名: ");
        String name = sc.next();
        System.out.println("请输入年龄: ");
        int age = sc.nextInt();
        System.out.println("请输入生日: ");
        String birth = sc.next();
        Student stu = new Student(num, name, age, birth);
        list.add(stu);
        System.out.println("添加成功!");
    }
    public static int getNum(ArrayList<Student> list, String num)
    {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (num.equals(stu.getNum()))
            {
                //找到了
                index = i;
                break;
            }
        }
        return index;
    }

}
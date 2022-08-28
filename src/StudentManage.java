import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/09/4:47
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class StudentManage {
    //主页面
    public static void main(String[] args) {
        ArrayList<Student> studentMes = new ArrayList<>();
        while (true) {
            System.out.println("~~~~~~欢迎来到学生信息管理系统~~~~~~");
            System.out.println("1.增加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.显示所有学生");
            System.out.println("5.退出系统");
            System.out.println("~~~~~~~~~~~~俺是分割线~~~~~~~~~~~~");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            switch (s) {
                case "1":
                    addMes(studentMes);
                    break;
                case "2":
                    delMes(studentMes);
                    break;
                case "3":
                    altMes(studentMes);
                    break;
                case "4":
                    showMes(studentMes);
                    break;
                case "5":
                    System.out.println("已退出，欢迎再次使用本系统");
                    return;
            }
        }
    }

    //添加信息方法
    public static void addMes(ArrayList<Student> studentMes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String id = sc.nextLine();
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入性别：");
        String sex = sc.nextLine();
        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        //把输入的信息利用Student的构造方法生成对象s
        Student s = new Student(id, name, sex, age);
        //把对象s添加到studentMes集合中
        studentMes.add(s);
    }

    //删除信息方法
    public static void delMes(ArrayList<Student> studentMes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生姓名：");
        String s = sc.nextLine();
        for (int i = 0; i < studentMes.size(); i++) {
            //遍历集合中的对象,用student接收
            Student student = studentMes.get(i);
            if (student.getName().equals(s)) {   //定位到该对象
                studentMes.remove(i);
                System.out.println("删除成功！");
            } else {
                System.out.println("找不到该学生信息");
            }
            break;
        }
    }

    //修改信息方法
    public static void altMes(ArrayList<Student> studentMes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改的学生姓名：");
        String s = sc.nextLine();
        for (int i = 0; i < studentMes.size(); i++) {
            //遍历集合中的对象,用student接收
            Student student = studentMes.get(i);
            if (student.getName().equals(s)) {   //定位到该对象
                System.out.println("待修改的学生信息如下：");
                System.out.println("姓名\t\t性别\t\t年龄\t\t学号");
                System.out.print(studentMes.get(i).getName() + "\t");
                System.out.print(studentMes.get(i).getSex() + "\t\t");
                System.out.print(studentMes.get(i).getAge() + "\t\t");
                System.out.println(studentMes.get(i).getId() + "\t\t");
                System.out.println("请输入新的姓名：");
                String newName = sc.nextLine();
                System.out.println("请输入新的性别：");
                String newSex = sc.nextLine();
                System.out.println("请输入新的年龄：");
                String newAge = sc.nextLine();
                System.out.println("请输入新的学号：");
                String newId = sc.nextLine();
                //新输入的学生信息用构造方法生成对象newStudent
                Student newStudent = new Student(newId, newName, newSex, newAge);
                //把索引处的集合元素替换成newStudent对象
                studentMes.set(i, newStudent);
                System.out.println("修改成功！");
                break;
            } else {
                System.out.println("找不到该学生信息");
            }
            break;
        }
    }

    //显示信息方法
    public static void showMes(ArrayList<Student> studentMes) {
        System.out.println("姓名\t\t性别\t\t年龄\t\t学号");
        for (int i = 0; i < studentMes.size(); i++) {
            System.out.print(studentMes.get(i).getName() + "\t");
            System.out.print(studentMes.get(i).getSex() + "\t\t");
            System.out.print(studentMes.get(i).getAge() + "\t\t");
            System.out.println(studentMes.get(i).getId() + "\t\t");
        }
    }
}

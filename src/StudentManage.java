import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/09/4:47
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class StudentManage {
    //��ҳ��
    public static void main(String[] args) {
        ArrayList<Student> studentMes = new ArrayList<>();
        while (true) {
            System.out.println("~~~~~~��ӭ����ѧ����Ϣ����ϵͳ~~~~~~");
            System.out.println("1.����ѧ����Ϣ");
            System.out.println("2.ɾ��ѧ����Ϣ");
            System.out.println("3.�޸�ѧ����Ϣ");
            System.out.println("4.��ʾ����ѧ��");
            System.out.println("5.�˳�ϵͳ");
            System.out.println("~~~~~~~~~~~~���Ƿָ���~~~~~~~~~~~~");
            System.out.println("���������ѡ��");
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
                    System.out.println("���˳�����ӭ�ٴ�ʹ�ñ�ϵͳ");
                    return;
            }
        }
    }

    //�����Ϣ����
    public static void addMes(ArrayList<Student> studentMes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ�ţ�");
        String id = sc.nextLine();
        System.out.println("������������");
        String name = sc.nextLine();
        System.out.println("�������Ա�");
        String sex = sc.nextLine();
        System.out.println("���������䣺");
        String age = sc.nextLine();
        //���������Ϣ����Student�Ĺ��췽�����ɶ���s
        Student s = new Student(id, name, sex, age);
        //�Ѷ���s��ӵ�studentMes������
        studentMes.add(s);
    }

    //ɾ����Ϣ����
    public static void delMes(ArrayList<Student> studentMes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫɾ����ѧ��������");
        String s = sc.nextLine();
        for (int i = 0; i < studentMes.size(); i++) {
            //���������еĶ���,��student����
            Student student = studentMes.get(i);
            if (student.getName().equals(s)) {   //��λ���ö���
                studentMes.remove(i);
                System.out.println("ɾ���ɹ���");
            } else {
                System.out.println("�Ҳ�����ѧ����Ϣ");
            }
            break;
        }
    }

    //�޸���Ϣ����
    public static void altMes(ArrayList<Student> studentMes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������޸ĵ�ѧ��������");
        String s = sc.nextLine();
        for (int i = 0; i < studentMes.size(); i++) {
            //���������еĶ���,��student����
            Student student = studentMes.get(i);
            if (student.getName().equals(s)) {   //��λ���ö���
                System.out.println("���޸ĵ�ѧ����Ϣ���£�");
                System.out.println("����\t\t�Ա�\t\t����\t\tѧ��");
                System.out.print(studentMes.get(i).getName() + "\t");
                System.out.print(studentMes.get(i).getSex() + "\t\t");
                System.out.print(studentMes.get(i).getAge() + "\t\t");
                System.out.println(studentMes.get(i).getId() + "\t\t");
                System.out.println("�������µ�������");
                String newName = sc.nextLine();
                System.out.println("�������µ��Ա�");
                String newSex = sc.nextLine();
                System.out.println("�������µ����䣺");
                String newAge = sc.nextLine();
                System.out.println("�������µ�ѧ�ţ�");
                String newId = sc.nextLine();
                //�������ѧ����Ϣ�ù��췽�����ɶ���newStudent
                Student newStudent = new Student(newId, newName, newSex, newAge);
                //���������ļ���Ԫ���滻��newStudent����
                studentMes.set(i, newStudent);
                System.out.println("�޸ĳɹ���");
                break;
            } else {
                System.out.println("�Ҳ�����ѧ����Ϣ");
            }
            break;
        }
    }

    //��ʾ��Ϣ����
    public static void showMes(ArrayList<Student> studentMes) {
        System.out.println("����\t\t�Ա�\t\t����\t\tѧ��");
        for (int i = 0; i < studentMes.size(); i++) {
            System.out.print(studentMes.get(i).getName() + "\t");
            System.out.print(studentMes.get(i).getSex() + "\t\t");
            System.out.print(studentMes.get(i).getAge() + "\t\t");
            System.out.println(studentMes.get(i).getId() + "\t\t");
        }
    }
}

package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/9:37
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public abstract class People {
    private int age;
    private String name;

    public People() {
    }

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void eat();
}

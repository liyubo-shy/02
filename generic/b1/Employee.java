package generic.b1;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/28/15:09
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Employee {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

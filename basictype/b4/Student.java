package basictype.b4;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/07/0:03
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Student {
    private int age;
    private String name;
    private String address;

    public Student() {
    }

    public Student(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "{" +
                name + "," + age + "岁," + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, address);
    }
}

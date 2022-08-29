package generic.b2;

import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/29/17:08
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

}


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/09/4:30
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Student {
    //定义变量
    private String id;
    private String name;
    private String sex;
    private String age;
    //定义无参构造
    public Student() {
    }
    //定义构造方法
    public Student(String id, String name, String sex, String age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //定义get和set方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}

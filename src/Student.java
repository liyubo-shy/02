/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/09/4:30
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Student {
    //�������
    private String id;
    private String name;
    private String sex;
    private String age;
    //�����޲ι���
    public Student() {
    }
    //���幹�췽��
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
    //����get��set����
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

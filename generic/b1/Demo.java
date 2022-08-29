package generic.b1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/28/15:22
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Demo {
    public static void main(String[] args) {
        Employee li = new Employee("李余波", 1800, new MyDate(2, 30, 2000));
        Employee li1 = new Employee("李余波", 1800, new MyDate(2, 30, 2000));
        Employee li2 = new Employee("破余波", 1800, new MyDate(2, 30, 2002));
        Employee li3 = new Employee("破余波", 1800, new MyDate(2, 21, 2002));
        Employee li4 = new Employee("破余波", 1800, new MyDate(23, 30, 2002));
        Employee li5 = new Employee("破余波", 1800, new MyDate(23, 30, 2002));
        Employee chen = new Employee("陈小煤", 0, new MyDate(1, 1, 2001));
        Employee lu = new Employee("路飞", 300000, new MyDate(9, 23, 1987));
        ArrayList<Employee> arr = new ArrayList<>();

        arr.add(li);
        arr.add(li2);
        arr.add(li1);
        arr.add(li3);
        arr.add(li4);
        arr.add(li5);
        arr.add(chen);
        arr.add(lu);



        arr.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee a1, Employee a2) {
                if (!(a1 != null && a2 != null)) {
                    System.out.println("参数为空！");
                    return 0;
                }

                int i = a1.getName().compareTo(a2.getName());
                if (i != 0){
                    return i;
                }

                return a1.getBirthday().compareTo(a2.getBirthday());

            }
        });
        for (Employee e : arr) {
            System.out.println(e);
        }
    }
}

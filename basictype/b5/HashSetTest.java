package basictype.b5;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/08/22:01
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class HashSetTest {
    public static void main(String[] args) {
        TreeSet<Animal> hashSet = new TreeSet<>();
        Animal a1 = new Animal("����", 2);
        Animal a2 = new Animal("��ϸ", 1);
        Animal a3 = new Animal("��ϸ", 1);
        hashSet.add(a1);
        hashSet.add(a2);

        hashSet.add(a3);
        for (Animal a : hashSet){
            System.out.println(a);
        }
    }
}

package basictype.b7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/11/4:02
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Map06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������Ҫͳ�Ƶ��ַ�����");
        String line = sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            map.merge(key, 1, Integer::sum);
        }
        /*
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            Integer value = map.get(key);
            if (value == null){
                map.put(key,1);
            }
            else {
                map.put(key,value+1);
            }
        }
         */


        for (Character k  : map.keySet()){
            System.out.println(k+":"+map.get(k)+"��");
        }
    }
}

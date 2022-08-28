package basictype.b9;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/11/23:22
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> last = new TreeSet<>();


        String[] color = {"♥", "♣", "♦", "♠"};
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;
        for (String n : num) {
            for (String c : color) {
                hm.put(index, n + c);
                arr.add(index);
                index++;
            }
        }
        hm.put(index, "大王");
        arr.add(index);
        index++;
        hm.put(index, "小王");
        arr.add(index);

//        for (Integer s : hm.keySet()){
//            System.out.println(s+hm.get(s));
//        }

        //洗牌
        Collections.shuffle(arr);

        //发牌
        for (int i = 0; i < arr.size(); i++) {
            if (i > arr.size() - 4) {
                last.add(arr.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(arr.get(i));
                }
                if (i % 3 == 1) {
                    player2.add(arr.get(i));
                }
                if (i % 3 == 2) {
                    player3.add(arr.get(i));
                }
            }
        }
        System.out.println("第一副牌：");
        Show.showPoker(player1, hm);
        System.out.println("第二副牌：");
        Show.showPoker(player2, hm);
        System.out.println("第三副牌：");
        Show.showPoker(player3, hm);
        System.out.println("底牌：");
        Show.showPoker(last, hm);


    }
}

package basictype.b8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 *斗地主
 * @Author: bo
 * @Date: 2022/08/11/19:21
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Poker {
    public static void main(String[] args) {
        //创建ArrayList用于接收54张牌
        ArrayList<String> arr = new ArrayList<>();

        //创建花色和数字
        String[] color = {"♥", "♣", "♦", "♠"};
        String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //把54张牌存进数组
        for (String c : color) {
            for (String n : num) {
                arr.add(n + c);
            }
        }
        arr.add("大王");
        arr.add("小王");

        //洗牌
        Collections.shuffle(arr);

        //创建用于接收三组牌的玩家和底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> lastPoker = new ArrayList<>();

        //发牌
        for (int i = 0; i < arr.size(); i++) {
            if (i > arr.size() -4) {
                lastPoker.add(arr.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(arr.get(i));
                } else if (i % 3 == 1) {
                    player2.add(arr.get(i));
                } else {
                    player3.add(arr.get(i));
                }
            }
        }

        //调用方法看牌
        Show.showLast(lastPoker);
        Show.showPoker(player1);
        Show.showPoker(player2);
        Show.showPoker(player3);

    }

}

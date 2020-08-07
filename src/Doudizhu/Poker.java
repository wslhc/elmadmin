package Doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Poker
{
    public static void main(String[] args)
    {   //  创建map集合
        HashMap<Integer, String> pokerMap = new HashMap<>();
        //花色和数字
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♠","♣");
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");
        int count = 1;
           pokerMap.put(count++,"大王");
           pokerMap.put(count++,"小王");
//初始化其他牌
        for (String number: numbers){
             for (String color: colors){
                String card = color+ number;
                pokerMap.put(count++, card);
            }
        }
        System.out.println(pokerMap);

        //打乱顺序
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        //打乱
        Collections.shuffle(numberList);
        System.out.println(numberList);

        //创建玩家和底牌编号集合
        ArrayList<Integer> nop1 = new ArrayList<>();
        ArrayList<Integer> nop2 = new ArrayList<>();
        ArrayList<Integer> nop3 = new ArrayList<>();
        ArrayList<Integer> Nodipai = new ArrayList<>();

        //不发牌，发编号
        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);
            if (i >= 51){
                Nodipai.add(no);
            }else if(i%3 == 0){
                nop1.add(no);
            }else if(i%3 == 1){
                nop2.add(no);
            }else {
                nop3.add(no);
            }
        }
             //对手中的编号排序
        Collections.sort(nop1);
        Collections.sort(nop2);
        Collections.sort(nop3);
        Collections.sort(Nodipai);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //遍历
        for (Integer i : nop1){
            String card = pokerMap.get(i);
            player1.add(card);
        }
        for (Integer i : nop2){
            String card = pokerMap.get(i);
            player2.add(card);
        }
        for (Integer i : nop3){
            String card = pokerMap.get(i);
            player3.add(card);
        }
        for (Integer i : Nodipai){
            String card = pokerMap.get(i);
            dipai.add(card);
        }

        System.out.println("张思雪"+ player1);
        System.out.println("李海超"+ player2);
        System.out.println("石宇航"+ player3);
        System.out.println("底牌"+ dipai);



    }
}

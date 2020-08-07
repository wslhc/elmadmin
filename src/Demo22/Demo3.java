package Demo22;

import java.util.ArrayList;
import java.util.Random;

public class Demo3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20 ; i++) {




            list.add(random.nextInt(1000)+1);
        }
        System.out.println("创建的集合是"+list);
        ArrayList<Integer> arrayList = getArrayList(list);
        System.out.println("筛选后的集合是"+arrayList);
    }
    public static ArrayList<Integer> getArrayList(ArrayList<Integer>list){
        ArrayList<Integer> oushuList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer number = list.get(i);
            if (number%2 == 0){
                oushuList.add(number);
            }
        }
        return oushuList;
    }
}

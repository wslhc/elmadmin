package Demo22;

import java.util.ArrayList;
import java.util.Random;

public class Demo
{
    public static void main(String[] args)
    {
        //ArrayList{<>里的写类型———>是你填写的类型}
        ArrayList<String> list = new ArrayList<>();
        list.add("鲁班七号");
        list.add("安其拉");
        list.add("铠");
        //可以直接打印ArrayList
        System.out.println(list);
    /*  ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // int  number = random.nextInt(100);
//          list.add(number);
            list.add(random.nextInt(100));*/
        System.out.println("++++++++++++++++++++++");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------删除---------------");
     /*   String s = list.remove(2);
        System.out.println(s);*/
        System.out.println(list.remove(2));
        System.out.println("删除后的集合"+list);
    }

    }


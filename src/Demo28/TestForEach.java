package Demo28;

import java.util.ArrayList;
import java.util.Collection;

public class TestForEach
{
    public static void main(String[] args)
    {
       /* int[] arr = {1, 4, 6, 7, 8};
         for (int a : arr){
             System.out.println(a);*/
   // }
        Collection<String> coll = new ArrayList<>();
        //add
        coll.add("小鹿般");
        coll.add("大桥");
        coll.add("安其拉");
        for(String hero : coll){
            System.out.println("当前英雄是"+ hero);

         }
    }
}

package Demo24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Demo1
{
    public static void main(String[] args)
    {
        new Random().nextInt(100);
        int[] arr = new int[10];
      //  ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
           arr[i] = new Random().nextInt(100);
            // list.add(new Random().nextInt(100););
        }
        //排序前
        System.out.println("排序前："+ Arrays.toString(arr));
    //    Arrays.toString();
        //排序后
        Arrays.sort(arr);
        System.out.println("排序后："+ Arrays.toString(arr));
    }
}

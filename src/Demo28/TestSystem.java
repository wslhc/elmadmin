package Demo28;

import java.util.Arrays;

public class TestSystem
{
    public static void main(String[] args)
    {//将src中前三个元素，赋值到后一个数组的前三个位置，
        //操作之后:[1, 2, 3, 4, 5] dest[1, 2, 3, 8, 5]
        int[] src = new int[]{1, 2, 3, 4, 5};
        int[] dest = new int[]{6, 5, 7, 8, 5};
        System.arraycopy(src, 0, dest,0,3);
        System.out.println(Arrays.toString(dest));




    }


}

package Demo22;

import java.util.ArrayList;

public class MyList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("添加元素后：");
        System.out.println(list);
        int remove=list.remove(list.size()-1);
        System.out.println("获取元素：");
        System.out.println(remove);
        System.out.println("获取元素后：");
        System.out.println(list);
    }

}

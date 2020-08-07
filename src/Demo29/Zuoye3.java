package Demo29;

import java.util.HashMap;
import java.util.Set;

public class Zuoye3
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        System.out.println(map);

        map.put(5, "李晓红");
        System.out.println(map);

        String s = map.remove(1);
        System.out.println(s);

        map.put(2,"周林");
        System.out.println(map);

        Set<Integer> is = map.keySet();
        for (Integer key : is){
            Object value= map.get(key);
            System.out.println(key+"--"+value);
        }



    }


}

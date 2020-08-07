package Demo29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Zuoye2
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("鲁班","射手");
        map.put("后裔","射手");
        map.put("甄姬","法师");
        map.put("猴子","战士");

        System.out.println(map);
        //得到所有的value
        Collection<String> values = map.values();
        //for增强得到每一个value
        for (String value : values){
            System.out.println(value);
        }

        System.out.println("--------------");
        //用迭代器打印输出每个value
        Iterator<String> iterator = values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

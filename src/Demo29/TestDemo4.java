package Demo29;

import java.util.HashMap;

public class TestDemo4
{
    public static void main(String[] args)
    {
        HashMap<Demo4, String> map = new HashMap<>();
        map.put(new Demo4("刘能",12),"锦州");
        map.put(new Demo4("广坤",13),"大连");
        map.put(new Demo4("赵四",14),"朝阳");
        map.put(new Demo4("老七",15),"鞍山");
        map.put(new Demo4("刘能",12),"锦州");

        for(Demo4 key :map.keySet()){
            String val = map.get(key);
            System.out.println(key +"......."+val);
        }

    }
}

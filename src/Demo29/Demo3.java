package Demo29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3{
    public static void main(String[] args)
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("吕布", "貂蝉");
        map.put("孙策", "大乔");
        map.put("周瑜", "二乔");
        map.put("刘备", "孙尚香");
        //获取所有的entry对象
        Set<Map.Entry<String, String>> entryet = map.entrySet();
        //遍历每一个entry对象
        for(Map.Entry<String, String> entry : entryet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}

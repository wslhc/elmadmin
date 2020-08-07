package Demo29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2
{
    public static void main(String[] args)
    {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("华为", "荣耀");
        map.put("苹果", "11");
        map.put("vivo", "X");
        map.put("oppo", "Reno");
        System.out.println(map);

        String s = (String) map.get("苹果");
        System.out.println(s);

        String s1 = (String) map.remove("华为");
        System.out.println(s1);

        System.out.println(map.containsKey("华为"));

        Set<Object> keys = map.keySet();
        for (Object key : keys) {


            String val = (String) map.get(key);
            System.out.println(key + "和" + val + "是一对");
        }

        Set<Map.Entry<Object, Object>> entryet = map.entrySet();
        for (Map.Entry<Object, Object> entry : entryet) {
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}

package Demo29;

import java.util.HashMap;

public class Zuoye1
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = new HashMap<>();
               map.put("鲁班","射手");
               map.put("后裔","射手");
               map.put("甄姬","法师");
               map.put("猴子","战士");
        System.out.println(map);

        String s = map.get("鲁班");
        System.out.println(s);
        String s1 = map.remove("后裔");
        System.out.println(s1);
        String s2 = map.put("大乔","辅助");

        System.out.println(map);


    }
}

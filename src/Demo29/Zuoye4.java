package Demo29;

import java.util.HashMap;

public class Zuoye4
{
    public static void main(String[] args)
    {
        // 1.定义第一个数组arr1
        String[] arr1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        // 2.定义第二个数组arr2
        String[] arr2 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            String key = arr1[i];
            String value = arr2[i];

            map.put(key, value);
        }
        System.out.println(map);
    }
}

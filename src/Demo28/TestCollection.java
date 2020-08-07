package Demo28;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection
{
    public static void main(String[] args)
    {//使用多态方法创建集合对象
        Collection<String> coll = new ArrayList<>();
        //add
        coll.add("小鹿般");
        coll.add("大桥");
        coll.add("安其拉");
        System.out.println(coll);
        System.out.println(coll.contains("小鹿般"));//true
        System.out.println(coll.contains("wangzhaojun"));//flase
///remove  (E e) 把指定对象删除从e集合
        System.out.println(coll.remove("小鹿般"));
        System.out.println("删除之后" + coll);

        System.out.println(coll.isEmpty());//flase
          //size() 返回集合中的所有元素
        System.out.println(coll.size());//2

        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]
            );
            //clear(), 清楚集合中所有元素
            coll.clear();
            System.out.println(coll);

        }


    }
}

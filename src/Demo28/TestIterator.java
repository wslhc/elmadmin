package Demo28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator
{
    public static void main(String[] args)
    {
        Collection<String> coll = new ArrayList<>();
        //add
        coll.add("小鹿般");
        coll.add("大桥");
        coll.add("安其拉");
        //遍历
        Iterator<String> iterator = coll.iterator();
        //iterator.hasNext() 判断是否有迭代那个元素
        while (iterator.hasNext()) {
            //获取迭代的 元素
            String s = iterator.next();
            System.out.println(s);
        }
    }
}

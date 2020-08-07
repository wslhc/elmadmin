package Demo27;

import java.util.Date;

public class TestDeta
{
    public static void main(String[] args)
    {
        //创建日期对象，返回当前的时间
        System.out.println(new Date());
        //Mon Jul 27 15:19:20 CST 2020

        //创建日期对象，把当前的毫秒值转化成日期对象
        System.out.println(new Date(0L));
        //Thu Jan 01 08:00:00 CST 1970
        //把日期对象转换成对应的毫秒值
        System.out.println(new Date().getTime());
        //1595834919693

        int i = 0;
        while (true){
            if (i==1000000){
                break;
            }
            i++;
        }
        System.out.println(new Date().getTime());





    }


}

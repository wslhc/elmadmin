package Demo27;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestDate2
{
    public static void main(String[] args)
    {
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(date);

        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = df.format(date);
        String str2 = df2.format(date);
        System.out.println(str);
        System.out.println(str2);


    }
}

package Demo27;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate3
{
    public static void main(String[] args) throws ParseException
    {
        String str = "2018-03-04";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(str);
       DateFormat df1 = new SimpleDateFormat("yyyy年MM月dd日");
       String str1 = df1.format(date);
        System.out.println(str);
        System.out.println(date);
        System.out.println(str1);




    }
}

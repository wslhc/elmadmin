package Demo27;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Zuoye1
{
    public static void main(String[] args) throws ParseException
    {
        String str = "2018-03-04";
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = df.parse(str);
        System.out.println(date);
    }
}

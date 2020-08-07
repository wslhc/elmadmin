package Demo28;

import java.util.Calendar;
import java.util.Date;

public class TestCalender
{
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);
        int mouth = calendar.get(Calendar.MONTH)+1;
        int dayofmouth = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year+"年"+mouth+"月"+dayofmouth+"日");


    }
}

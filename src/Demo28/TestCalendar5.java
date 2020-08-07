package Demo28;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar5
{
    public static void main(String[] args) throws ParseException
    {
        // calendar.getActualMaximum();// 获取给定日历的最大可能值
       String lastDay =  getLastDayOfMonth("2020-06");



    }

    // 编写一个方法， 根据给定字符串yyyy-MM获取当月的最后一天
    public static String getLastDayOfMonth(String yearmonth) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = sdf.parse(yearmonth);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);


        return yearmonth;
    }



}

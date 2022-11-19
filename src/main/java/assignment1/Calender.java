package assignment1;
import java.util.Arrays;
import java.util.List;

public class Calender {
    public boolean isLastDayOfMonth(Date d)
    {
        List<Integer> days_31 = Arrays.asList(1,3,5,7,8,10,12);
        boolean lastDayOfFebruary = (isLeapYear(d) && isFebruary(d) && d.day==29) || (!isLeapYear(d) && isFebruary(d) && d.day ==28);
        boolean lastDayOfOtherMonths = (d.day==31 && days_31.contains(d.month)) || (d.day==30 && !days_31.contains(d.month));
        return  lastDayOfFebruary || lastDayOfOtherMonths;
    }
    public boolean isLeapYear(Date d) {
        return (d.year % 400 == 0 || (d.year % 4 == 0 && d.year % 100 != 0));
    }
    public boolean isFebruary(Date d) {
        return d.month == 2;
    }
    public boolean isLastDayOfYear(Date d){
        return (d.month==12 && d.day==31);
    }
    public Date next_day(Date d)
    {
        int month = d.month;
        int day = d.day;
        int year = d.year;
        if(isLastDayOfYear(d))
        {
            day=1;
            month=1;
            year++;
        }
        else if(isLastDayOfMonth(d))
        {
            day=1;
            month++;
        }
        else{
            day++;
        }
        Date t_date = new Date(day, month, year);
        return t_date;
    }

}

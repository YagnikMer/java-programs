import java.util.*;

public class Leap_Year
{

    public static void checkLeapYear(int year)
    {
        boolean isLeapYear=false;
        if(year%4==0)
        {
            if(year%100==0)
            {
                 if(year%400==0)
                    isLeapYear=true;
                 else
                    isLeapYear=false;   
            }
            else
            {
                isLeapYear = true;
            }
        }
        else
        {
            isLeapYear=false;
        }
        if (isLeapYear==true)
        System.out.println(year + " is leap year");
        else
        System.out.println(year + " is not leap year");
    }
    public static void main(String[] args)
    {
        checkLeapYear(1900);
        checkLeapYear(1904);
        checkLeapYear(2000);
        checkLeapYear(2001);
    }
}

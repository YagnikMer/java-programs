import java.util.*;
import java.time.Instant;

public class TimeDiff
{
    public static void checkDifference()
    {
        Date d1 = new Date();
        Date d2 = getRandomDate();
        
        long timeDiff = d1.getTime() - d2.getTime();

        int hour = (int)timeDiff / (60*60*1000);
        int min = (int)(timeDiff - (hour*60*60*1000))/(60*1000);
        
        System.out.println(hour +":"+min);
    }
    public static Date getRandomDate()
    {
        Date d=new Date(System.currentTimeMillis()-((20*60*60*1000)-(2*60*1000)));
        // 19 : 58
        return d;
    }
    public static void main(String[] args)
    {
        checkDifference();  
    }
}

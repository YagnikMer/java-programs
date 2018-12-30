import java.util.*;

public class DateDiff
{
    public static void checkDifference()
    {
        Date d1 = new Date();
        Date d2 = new Date(0); //epose date 01 
        Date d3 = get15back();
        
        
        long Diff1 = d1.getTime() - d2.getTime();
        long Diff2 = d1.getTime() - d3.getTime();
        
        int days1 = (int)(Diff1 /(24*60*60*1000))   ;
        int days2 = (int)(Diff2 /(24*60*60*1000));
        
        System.out.println("Epose diff : "+days1);
        System.out.println("15 diff : "+days2);
    }

    public static Date get15back()
    {
     Date d=new Date(System.currentTimeMillis()-(15*24*60*60*1000));
     return d;
    }

   
    public static void main(String[] args)
    {
        checkDifference();  
    }
}

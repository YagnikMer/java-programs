import java.text.SimpleDateFormat;  
import java.util.Date;

class StringDate
{
    public static void main(String[] args)
    {
        String strDate = "17/12/1990";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            Date d1 = format.parse(strDate);
            System.out.println("String to Date : " +d1);
        }
        catch(Exception e)
        {
            System.out.println("String to Date : " +e.getMessage());
        }
        Date d2 = new Date();
        String dateStr = format.format(d2);
        System.out.println("String to Date : " +dateStr);
    }
}

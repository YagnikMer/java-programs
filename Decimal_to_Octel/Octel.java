import java.util.*;

public class Octel
{
    public static void main(String[] args)
    {
        int number = 78;
        int remainder =0;
        int rev=0;
        int octel=0;
        while(number>0)
        {
            remainder = number %8;
            rev =  remainder+(rev*10);
            number = number/8;
        }
        while(rev>0)
        {
            remainder = rev%10;
            octel = (octel*10)+remainder;
            rev = rev/10;
        }
        System.out.println("Octel : " + octel);
    }
}

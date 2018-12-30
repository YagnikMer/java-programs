import java.util.*;

public class Octel
{
    public static void main(String[] args)
    {
        int octel=346;
        int number = 0;
        int remainder =0;
        int base = 0;
        
        while(octel>0)
        {
            remainder = octel % 10;
            number = number + remainder * (int)Math.pow(8,base);
            System.out.println("Number : "+number + " Base : " +base + " Power : "+Math.pow(8,base) + " Rem : " + remainder);
            base++;
            octel = octel / 10;
            
        }
        System.out.println("Octel : " + number);
    }
}

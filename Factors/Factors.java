import java.util.*;

public class Factors
{
    public static void main(String[] args)
    {
        int number = 60;

        for (int i=1;i<=60;i++)
        {
            if (number%i==0)
            System.out.print(i+",");    
        }
            System.out.println();
    }
}

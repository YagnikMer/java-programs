import java.util.*;

public class PrimeNumber
{
    public static boolean isPrime(int value)
    {
        boolean mFlag = true;
        if (value == 0 || value == 1)
        {
            return false;
        }
        else
        {
            for (int i=2; i<value; i++)
            {
                if(value%i==0)
                {
                    mFlag = false;
                }
            }
        }
        return mFlag;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = in.nextInt();

        for (int i=0;i<=range; i++)
        {
            if (isPrime(i) == true)
            {
               System.out.print(i+",");
            }
        }
        System.out.println("");
    }
}

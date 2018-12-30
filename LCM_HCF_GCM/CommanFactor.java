import java.util.*;

public class CommanFactor
{
    public static void getGCD(int number1,int number2)
    {
        int gcd = 1;
        for (int i=1;i<=number1 && i<=number2;i++)
        {
            if (number1%i==0 &&  number2%i==0)
            {
                gcd =i;
            }                        
        }
        System.out.println(number1 +","+number2+" GCD : " +gcd);
                
    }
            
    public static void getLCM(int number1,int number2)
    {
        int lcm;
        if(number1>number2)
            lcm=number1;
        else
            lcm=number2;

        while(true)
        {
            if (lcm%number1==0 && lcm%number2==0)
            {
               
               break;    
            }
            lcm++;
        }
        System.out.println(number1 +","+number2+" LCM : " +lcm);
                
    }

    public static void main(String[] args)
    {
          getGCD(72,120); // 24
          getLCM(72,120); // 360
    }
}

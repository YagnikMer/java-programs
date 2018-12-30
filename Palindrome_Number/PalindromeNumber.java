import java.util.*;

public class PalindromeNumber
{      
    public static boolean checkPalindromeNumber(int number)
    {
        boolean mFrag = false;
        int temp = number;
        int reverse = 0;
        int remainder;

        while(number > 0)
        {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        if (temp == reverse)
            mFrag = true;

        return mFrag;
        
    }
    public static void main(String[] args)
    {
        if (checkPalindromeNumber(121))
            System.out.println("121 is palindrome");
        else
            System.out.println("121 is not palindrome");

        if (checkPalindromeNumber(122))
            System.out.println("122 is palindrome");
        else
            System.out.println("122 is not palindrome");
    }
}

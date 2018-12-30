import java.util.*;

public class DecimalToBinary
{
    public static String convertDecimalToBinary(int decimalNum)
    {
        int remainder;
        String binary = "0";
        while(decimalNum > 0)
        {
            remainder = decimalNum % 2;
            if (remainder == 0)
            binary = binary + "0";
            else
            binary = binary + "1";
            decimalNum = decimalNum / 2;
        }
        return binary;
    }

    public static String reverseString(String str)
    {
        String reverse = "";
        int length = str.length();
        for (int i=length-1; i>0; i--)
        {
            reverse = reverse + str.charAt(i); 
        }
        return reverse;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the decimal number :");
        int decimalNum = in.nextInt();
        String binary = convertDecimalToBinary(decimalNum);
        System.out.println("Decimal : " + decimalNum + " Binary : " + reverseString(binary));
    }
}

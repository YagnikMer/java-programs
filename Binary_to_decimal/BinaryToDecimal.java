import java.util.*;

public class BinaryToDecimal
{
    public static int convertBinaryToDecimal(int binaryNum)
    {
        int remainder;
        int decimalNum = 0;
        int base =1;
        
        while(binaryNum > 0)
        {
            remainder = binaryNum % 10;
            decimalNum = decimalNum + (remainder * base); // remainder is 0 not add any
            base = base * 2;                              // change root base
            binaryNum = binaryNum / 10;
        }
        return decimalNum;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the binary number :");
        int binaryNumber = in.nextInt();
        int decimalNumber = convertBinaryToDecimal(binaryNumber);
        System.out.println("Binary : " + binaryNumber + " Decimal : " + decimalNumber);
    }
}

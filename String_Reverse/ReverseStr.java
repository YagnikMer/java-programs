import java.util.*;

public class ReverseStr
{

    public static void getReverseStr(String str)
    {
        String rev="";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse : " + rev);
    }
    public static void main(String[] args)
    {
        getReverseStr("Good Morning");
    }
}

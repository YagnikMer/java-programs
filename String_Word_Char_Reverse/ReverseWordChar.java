import java.util.*;

public class ReverseWordChar
{

    public static void getReverseStr(String str)
    {
        String rev="";
        String word="";

        for (int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);    
            if (ch == ' ')
            {
                rev=ch+word+rev;
                word="";
            }
            else
            {
                word=word+ch;
            }            
            if (i==0)
            {
                rev=word+rev;                
            }           
        }
        System.out.println(rev);
    }
    public static void main(String[] args)
    {
        getReverseStr("I am king of the world");
    }
}

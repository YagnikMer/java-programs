import java.util.*;

public class ReverseWords
{

    public static void getReverseStr(String str)
    {
        String rev="";
        String word="";

        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);    
            if (ch == ' ')
            {
                rev=ch+word+rev;
                word="";
            }
            else
            {
                word = word+ch;
            }            
            if (i == (str.length()-1))
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

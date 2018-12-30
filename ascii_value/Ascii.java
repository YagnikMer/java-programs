import java.util.*;

public class Ascii
{
    public static void main(String[] args)
    {
        char char_A ='A';
        char char_a ='a';
        int A_value = (int)char_A;
        int a_value = (int)char_a;

        System.out.println("A:" + A_value + " a:" +a_value);
        System.out.println("65: " + (char)A_value + " 97:" +(char)a_value);
    }
}

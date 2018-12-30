import java.util.*;

public class AsciiChar
{
    public static void main(String[] args)
    {
        // A to Z
        for(int i=65;i<=90;i++)
            System.out.print((char)i+",");

            System.out.println();
        // a to z
        for(int i=97;i<=122;i++)
            System.out.print((char)i+",");

            System.out.println();
        // 0 to 9
        for(int i=48;i<=57;i++)
            System.out.print((char)i+",");

            System.out.println();
    }
}

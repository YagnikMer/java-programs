import java.util.*;

public class FabonacciSeries
{
    public static void showFabonacciSeries(int steps)
    {
        int n1=0;
        int n2=1;
        int n3=n1+n2;

        System.out.print(n1+",");
        System.out.print(n2+",");

        for (int i=2;i<steps; i++)
        {
            n3=n1+n2;        
            System.out.print(n3+",");
            n1=n2;
            n2=n3;
        }
        System.out.println("");
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Steps : ");
        int step = in.nextInt();
        showFabonacciSeries(step);        
    }
}

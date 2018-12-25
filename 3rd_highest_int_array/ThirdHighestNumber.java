import java.util.*;

public class ThirdHighestNumber
{
    public static int getHighestNumber(int[] intList,int position)
    {
        int temp;
        for (int i=0; i<intList.length; i++)
        {
            for (int j=i+1; j<intList.length; j++)
            {
                // descending order
                if(intList[i] < intList[j])
                {
                    temp = intList[i];
                    intList[i] = intList[j];
                    intList[j] = temp;
                }
            }
        }
        return intList[position-1];
    }
    public static void main(String[] args)
    {
        int[] list = {3,4,1,5,6,7,8,9,2,10};
        System.out.println("3rd Highest Number : " +getHighestNumber(list,1));
    }
}

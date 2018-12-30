import java.util.*;

public class ThirdHighestNumber
{
    public static int getHighestNumber(int[] intList,int position)
    {
        int max = -1;
        int index = -1;
        for (int j=0; j<position; j++)
        {
            max = -1;          
            for (int i=0; i<intList.length; i++)
            {
                if(max < intList[i])
                {
                    max = intList[i];
                    index = i;
                }
            }
            intList[index] = -1;
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] list = {8,4,1,5,6,7,10,9,2,3};
        System.out.println("3rd Highest Number : " +getHighestNumber(list,3));
    }
}

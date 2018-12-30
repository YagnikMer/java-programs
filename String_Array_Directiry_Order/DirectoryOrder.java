import java.util.*;

public class DirectoryOrder
{

    public static String[] getDirectoryOrder(String[] strArr)
    {       
        for (int i=0;i<strArr.length;i++)
        { 
           for (int j=i+1;j<strArr.length;j++)
           { 
                if (strArr[i].compareTo(strArr[j])>0)
                {
                    String temp = strArr[i];
                    strArr[i] =  strArr[j];
                    strArr[j] = temp;
                }
           }       
        }
        return strArr;
    }
    public static void main(String[] args)
    {
        String[] strArr = {"Java","JavaScript","Ruby","CSharp","Android","Object C","C","C++"};
        String[] arr = getDirectoryOrder(strArr);
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

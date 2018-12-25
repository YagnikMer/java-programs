import java.util.*;

public class StringPermutations
{
     public static ArrayList<String> getStringPermutations(String str)
     {
        ArrayList<String> mList = new ArrayList<String>();
        if(null == str)
        {
            return null;
        }
        if (str.length()==0)
        {
            mList.add("");
            return mList;
        }
        
        char firstChar = str.charAt(0);
        String remainChar = str.substring(1);
        ArrayList<String> wordList = getStringPermutations(remainChar);
        
        for (int i=0; i < wordList.size(); i++)
        {
            String word = wordList.get(i);
            for (int j=0; j <= word.length(); j++)
            {
                String startChars = word.substring(0,j);
                String endChar = word.substring(j);
                String newWord = startChars + firstChar + endChar;
                mList.add(newWord);
            }
        }
        return mList;            
     }
     public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = in.nextLine();
        System.out.println("Permutations of String");
        System.out.println(getStringPermutations(str));
     }
}  

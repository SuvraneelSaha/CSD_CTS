public class O15_NumberofNewWords
{
  public static void main(String[] args)
  {

  }
}
//import the necessary packages if needed
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
// PUBLIC 
 class UniqueWords
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student's Article");
        // for the space 
        // System.out.println();
        
        String str = in.nextLine();
        
        str = str.toLowerCase();
        
        String[] strArr = str.split("[,;:.?! ]+");
        int strArrLength = strArr.length;
        System.out.println("Number of words "+strArrLength);
        
        // for the space 
        System.out.println();
        
       
        TreeSet<String> uniqTreeSet = new TreeSet<String>();
        
        for(int i = 0 ; i<strArrLength;i++)
        {
            uniqTreeSet.add(strArr[i]);
        }
        
        System.out.println("Number of unique words "+uniqTreeSet.size());
        
        
        System.out.println("The words are");
        int i = 1 ;
        for(String uniq : uniqTreeSet)
        {
            System.out.println(i+". "+uniq);
            i++;
        }
        
        //System.out.println();
        
        //System.out.println();
        
        
        
        
    }
}
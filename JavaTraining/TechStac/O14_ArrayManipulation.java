public class O14_ArrayManipulation
{
  public static void main(String[] args)
  {

  }
}
import java.util.*;
// public 
 class ArrayException extends Exception{
   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayException obj = new ArrayException();
        
        System.out.println(obj.getPriceDetails());
    }
    public String getPriceDetails() 
    {
        Scanner in = new Scanner(System.in);
        String str ="";
         int n=0;
         int[] arr;
         
        try
        {
            System.out.println("Enter the number of elements in the array");
              
            n=in.nextInt();
            
             arr =new int[n];
            
            System.out.println("Enter the price details");
            
            for (int i = 0;i<n;i++)
            {
                arr[i] = in.nextInt();
            }
            
            System.out.println("Enter the index of the array element you want to access");
            
            int index = in.nextInt();
            
            str= "The array element is " +String.valueOf(arr[index]);
            return str;
            
        }
        catch(InputMismatchException e)
        {
            return "Input was not in the correct format";
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            return "Array index is out of range";
        }
    }
    
}
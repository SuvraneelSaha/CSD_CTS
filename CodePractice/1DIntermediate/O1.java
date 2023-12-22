import java.util.*;

public class O1 {

   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the size of the array :");
    int n = in.nextInt();

    int[] arr = new int[n];

    System.out.println("Please enter the elements in the array : ");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    int duplicates = 0 ;

    for (int i = 0; i < arr.length-1; i++) 
    {
      if(arr[i] == arr[i+1])
      {
        duplicates=duplicates+1;
      }
    }

    System.out.println("The Number of Duplicate elements are "+duplicates);

    


   }
}

// Use it by - unordered map , ordered map . hashmap   
// stl containers 
// vectors 
package JavaTraining.Week3.Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class O10 {
  public static void main(String[] args) {
    int[] arr = {1,2,3,5};
    System.out.println(missingNumber(arr));
  }
   static int missingNumber(int arr[]) {
       
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
          list.add(arr[i]);
        }

        System.out.println(list);

        Collections.sort(list);

        if(list.size() == 1)
        {
          return (int)list.get(0)+1;
        }

        for(int i = 0 ; i < list.size()-2;i++)
        {
          if(list.get(i+1) > list.get(i))
          {
              return (int)list.get(i)+1;
          }
        }

        return 0 ; 








        // Arrays.sort(arr);
        
        // int ans = 0;
        
        // for(int i = 0 ; i < arr.length-1 ; i++)
        // {
        //     if(arr[i+1] - arr[i] > 1)
        //     {
                
        //        ans = arr[i]+1;
        //     }
        //     else
        //     {
                
        //     }
        // }
        
        // return ans;
       
    }
}

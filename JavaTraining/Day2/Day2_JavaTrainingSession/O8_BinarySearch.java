package JavaTraining.Day2.Day2_JavaTrainingSession;

import java.util.Arrays;

public class O8_BinarySearch {
  public static void main(String[] args) {
    int[] arr = {11,22,10,3,4};

    for(int v : arr)
    System.out.println(v);

    System.out.println("Binary Search : ");

    int[] arr1 = {12,3,4};
    Arrays.sort(arr1);
    int search = 12 ; 
    System.out.println(Arrays.binarySearch(arr1, search));

    // depending on the position of the element that is not present the 
    // o/p will come 

    // ex - arr = {2,5,12}; 
    // search = 10 
    // then binarySearch(arr,search)
    // -3 is the o/p
    // ie position value will be returned 
    // if the element is present it will give the index only 
    // and if not present it will give the position value 

  }
  
}

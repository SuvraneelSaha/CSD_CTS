package JavaTraining.Day2.Day2_JavaTrainingSession;

import java.util.Arrays;
import java.util.Scanner;

public class O7_SearchElementInArray {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("enter the size of the array : ");

    int n = in.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements : ");

    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = in.nextInt();

    }

    System.out.println("The Array is "+Arrays.toString(arr));

    System.out.println("Enter the element to be searched : ");

    int search = in.nextInt();

    boolean isPresent = false ; 

    for(int i = 0 ; i < arr.length ; i++)
    {
      if(arr[i] == search)
      {
        System.out.println("The position of "+search+" is "+(i+1));
        isPresent = true ; 
        break;
        
      }
      else
      {

      }
    }

    if(!isPresent)
    {
      System.out.println("Not Present");
    }



    
  }  
}

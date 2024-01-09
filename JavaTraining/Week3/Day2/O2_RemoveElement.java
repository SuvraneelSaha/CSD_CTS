package JavaTraining.Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.*;

public class O2_RemoveElement {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("enter the number of elements in the array :");

    int n = in.nextInt();
    int[] arr = new int[n];


    System.out.println("enter the elements : ");


    for(int i = 0 ; i < arr.length;i++)
    {
      arr[i] = in.nextInt();
    }

    System.out.println(Arrays.toString(removeElement(arr)));

  }

  public static int[] removeElement(int[] arr)
  {
   
    ArrayList<Integer> al = new ArrayList<Integer>() ; 

   for (int i = 0; i < arr.length; i++)
  {
    al.add(arr[i]);
  }

    for (int i = 0; i < al.size(); i++)
    {
      if(al.get(i) == 10)
      {
        al.remove(i);
      }  
    }

   int[] ans = new int[al.size()];

   for(int i = 0 ; i < ans.length ; i++)
   {
    ans[i] = al.get(i);
   }

   return ans;

  }
}

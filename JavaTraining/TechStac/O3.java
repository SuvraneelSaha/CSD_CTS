package JavaTraining.TechStac;

import java.util.Scanner;

public class O3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[4];
    System.out.println("Enter the digits:");
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = Integer.parseInt(in.nextLine());  
    }

    for (int i = 0; i < arr.length; i++)
    {
      char ch=(char)arr[i];
      System.out.println(arr[i]+"-"+ch);
    }
  }
}

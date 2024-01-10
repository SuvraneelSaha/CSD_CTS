package JavaTraining.Week3.Day3;

import java.util.Scanner;

public class O1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    for (int i = 0; i < 5; i++) 
    {
      for (int j = 0; j <=i;  j++)
       {
        System.out.print("*");  
      }  
      System.out.println();
    }
  }
}

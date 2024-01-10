package JavaTraining.Week3.Day3;

import java.util.Scanner;

public class O2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int row = 5;
    for (int i = 0; i <= row; i++)
    {
        for (int j = row - i; j >= 1; j--)
        {
          System.out.print(" ");  
        } 
        for(int k = 0 ; k<=i;k++)
        {
          System.out.print("* ");
        }
        System.out.println();
    }
  }
}

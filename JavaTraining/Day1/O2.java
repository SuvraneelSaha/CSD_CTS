package JavaTraining.Day1;

import java.util.Scanner;

public class O2 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter the number to check whether it is a positive number or not :");

    int n = in.nextInt();

    isPositive(n);
  }

  public static void isPositive(int n)
  {

    if(n ==0)
    {
      System.out.println("the Number is 0");
    }
    else
    {
      String ans = n>0 ? "The Number is positive" : "The Number is Negative"; 
      System.out.println(ans);

    }
  }
  
}

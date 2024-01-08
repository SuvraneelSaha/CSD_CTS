package JavaTraining.Week3;

import java.util.Scanner;

public class POTD {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Number to check whether the number is in the fibonacci series or not : ");

    int n = in.nextInt();

    int a = 0 ; 
    int b = 1 ; 
    int c = 0 ; 

    while (c<n)
    {
      c = a + b ;
      a=b;
      b=c; 
    }

    if(c==n)
    {
      System.out.println("It is a number present in the fibonacci series");
    }
    else
    {
      System.out.println("NA");
    }
  }
}

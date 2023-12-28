package JavaTraining.Day2.Day2_JavaTrainingSession;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    System.out.println("Factorial of "+n+" is "+factorial(n));

  }

  public static int factorial(int n)
  {
    int fact = 1 ; 
    for(int i = n ; i >=1 ; i--)
    {
      fact = fact * i;
    }
    return fact ; 
  }
}

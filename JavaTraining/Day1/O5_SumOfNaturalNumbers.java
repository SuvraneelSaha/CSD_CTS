package JavaTraining.Day1;

import java.util.Scanner;

public class O5_SumOfNaturalNumbers {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("enter the number range ");
    int n =in.nextInt();
    int sum = 0 ;
    for(int i = 1 ; i <=n  ; i++)
    {
      sum = sum + i ;
    }

    System.out.println(sum);
  }
}

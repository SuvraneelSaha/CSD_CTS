package JavaTraining.Day1;

import java.util.Scanner;

public class O4_EvenOdd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter the number to check whether the number is even or odd :");

    int n = in.nextInt();

    if(evenOdd(n) == 1)
    {
      System.out.print("Even" + "\t"+"Number");
    }
    else
    {
      System.out.print("Odd"+"\t"+"Number");
    }


  }
  public static int evenOdd(int n)
  {
    int ans = n%2==0 ? 1 : 0 ;

    return ans ;


  }
}

package JavaTraining.Day1;

import java.util.Scanner;

public class O8_FactorOfANumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter a Number : ");

    int n = in.nextInt();
    int sum = 1 ;
    for(int i = n ; i >=1;i--)
    {
      sum = sum * i ; 
    }

    System.out.println("Factor of "+n+" is "+sum);
    
  }
}

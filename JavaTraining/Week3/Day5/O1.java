package JavaTraining.Week3.Day5;

import java.util.Scanner;

public class O1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the 1st Number :");
    int a = in.nextInt();
    System.out.println("Enter the 2nd number : ");
    int b = in.nextInt();
    // a= 5 , b = 7 

    System.out.println("The Two Elements before Swapping are "+a+" and " +b);

    a= a*b ; // 5*7 = 35 

    b= a/b; // 35/7=5;

    a= a/b; // 35/5 = 7 

    System.out.println("The Two elements after Swapping are "+a+" and "+b);

    



  }
}

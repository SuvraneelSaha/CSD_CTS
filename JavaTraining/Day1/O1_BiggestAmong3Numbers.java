package JavaTraining.Day1;

import java.util.Scanner;

public class O1_BiggestAmong3Numbers {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter the 3 Numbers : ");

    int a = in.nextInt();

    int b = in.nextInt();

    int c = in.nextInt();

    System.out.println("Maximum among the 3 numbers is "+Math.max(Math.max(a, b),c));
/*
 in.next() for words and 
 in.nextInt() for integer 

in.nextLine() for the whole line 
 */

    
  }
}

/*
 We know how to code now we have to write optimized code . 
 */
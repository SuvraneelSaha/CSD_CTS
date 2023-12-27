package JavaTraining.Day1;

import java.util.Scanner;

public class O6_Palindrome {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter the number : ");

    int n = in.nextInt();

    System.out.println(palindromeNumber(n));


  }
  public static boolean palindromeNumber(int n)
  {
    int num = n; 

    int rev = 0 ; 

    // 151 
    while(n>0)
    {
      int rem = n%10 ; 

      rev = rev*10 + rem ; 

      n=n/10;

    
    }

    if(rev == num)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
}

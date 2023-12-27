package JavaTraining.Day1;

import java.util.Scanner;

public class O7_POTD {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Number to Check whether it is a Palindrome or Not");
    int n = in.nextInt();

    System.out.println(n+" is a Palindrome Number "+isPalindrome(n));



  }
  public static boolean isPalindrome(int n)
  {
    int ans = n ; 
    int rev = 0 ;

    // 151 

    while (n>0)
    {
        int rem = n%10;
        rev = rev *10 + rem ;
        n=n/10;
    }

    if(rev==ans)
    {
      return true;
    }
    else
    {
      return false ; 
    }
  }
}

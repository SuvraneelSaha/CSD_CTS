package JavaTraining.Day2.Day2_JavaTrainingSession;

import java.util.Scanner;
// Palindromic string 
public class POTD {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the String:");

    String str = in.next();

   System.out.println(str);

   if(isPalindromeString(str) == true)
   {
    System.out.println("Palindromic String");
   }
   else
   {
    System.out.println("NA");
   }    
   

  }
  public static boolean isPalindromeString(String str)
  {
    String rev ="";

    for(int i = str.length()-1; i>=0;i--)
    {
      char ch = str.charAt(i) ;
      
      rev = rev + ch;

    }

    if(rev.equals(str))
    {

      return true ; 
    }
    else 
    {
      return false ;
    }
  }
}

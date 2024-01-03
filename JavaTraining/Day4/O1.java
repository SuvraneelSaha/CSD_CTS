package JavaTraining.Day4;

import java.util.Scanner;
import java.util.*;

public class O1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please enter the String : ");

    String str = in.nextLine();

    System.out.println(sumOfDigitsInAString(str));

    


  }

  public static int sumOfDigitsInAString(String str)
  {
    int ans = 0 ; 
    int flag = 0;
    for (int i = 0; i < str.length(); i++)
    {
      // char ch = str.charAt(i);
      
      if(Character.isDigit(str.charAt(i)))
      {
        ans = ans + Integer.parseInt(String.valueOf(str.charAt(i)));
        flag = 1 ; 
      }
      
    }
    if(flag==1)
    {

      return ans ; 
    }
    else
    {
      return -1;
    }


  }
}

/*
 WAP to get the sum of all the digits present in the given string , 

 include your class user main code with sum of digits 
 SumOfDigits with access strings as inputs 

 written the sum of o/ps 

 if there is no digit in the given string return -1 as output 
 create a class main which would get the input and call the static method 
 precending the user main code 

 Sample i/p 

 Good23Bad4

 o/p 
 4+3+2 = 9 


 */
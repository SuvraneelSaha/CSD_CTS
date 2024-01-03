package JavaTraining.Day4;

import java.util.Scanner;

public class O2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the String :");
    String str = in.nextLine();

    if(firstLastCharacter(str))
    {
      System.out.println("Yes Same characters at the first and the last ");


    }
    else
    {
      System.out.println("NA");
    }


  }

  public static boolean firstLastCharacter(String str)
  {

    if(str.isEmpty())
    {
      return false;
    }

    if(str.charAt(0) == str.charAt(str.length()-1))
    {
      return true;
    }
    return false;
  }
}

/*
 WAP to check whether the first character and the last character is the same or not 
 if it matches then return true and if it doesnt returns return false 


 */
package JavaTraining.Day3;

import java.util.Scanner;

public class O2_CharacterPresent_indexOf {
  public static void main(String[] args) {
    
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a String :");

    String str = in.nextLine();

    System.out.println("Enter an character to check whether it is present or not : ");
    char ch = in.next().charAt(0);

    // use indexof and lastIndexOf() ; 
   
    isCharacterPresent(str, ch);
    
  }
  public static void isCharacterPresent(String str,char ch)
  {
    if(!(str.indexOf(ch) >=0))
    {
      System.out.println("Character "+ch+" is not present ");
    }
    else
    {
      if(str.indexOf(ch) >=0 && str.lastIndexOf(ch) > str.indexOf(ch))
      {
        System.out.println("Present and Repeated");
      }  
      else
      {
        System.out.println("Present");
      }
    }
  }
}












// wap to find whether the given character present in the given string if so check whether it is repeated or not 

/*
 Sample input 

 Welcome
 e
 Sample o/p

 */

 /*
    * Write a program to find whether the given character 
    * present in the given string.If so then check whether it
    * is repeated or not
    * 
    *  Sample Input
    *  Welcome
    *   e
    *   Sampke Output
    *   Repeated
    *   
    *  Sample Input
    *  Welcome
    *  #
    *   Sampke Output
    *   Not present
    *   
    *  Sample Input
    *  Welcome
    *  W
    *   Sampke Output
    *   Yes, Not Repeated
    *   
    *   
    */

package DebobrataSir_Java.StringFunctions;

public class O6 {
  public static void main(String[] args) {
    // replace a part of the string with another character sequence in the string 

    String str = "This is OK";

    String ans ;
    ans = str.replace("OK", "The Opportunity of a Lifetime");
    System.out.println("Ans "+ans);


    System.out.println("Replace ");

    System.out.println(str.replace("OK", "THE OPPORTUNITY OF A LIFETIME"));

    System.out.println("Original String "+str);

    // Replace function does not changes the original string , it creates a new string 
    // based upon the character sequence or char that is needed to be replaced 


  }
}

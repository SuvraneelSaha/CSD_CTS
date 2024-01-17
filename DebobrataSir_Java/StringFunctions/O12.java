package DebobrataSir_Java.StringFunctions;

public class O12 {
  public static void main(String[] args) {
    // equalsIgnoreCase

    String str = "Welcome";
    String str1 ="welcome";

    System.out.println("str with str1 equals "+str.equals(str1));

    System.out.println("str with str1 with equalsIgnoreCase "+str.equalsIgnoreCase(str1));

    System.out.println("nigga".equals("aggin"));

    // equalsIgnoreCase does not check the character type of the strings 
    // if the alphabets are arranged in reverse order 
    // then it will give false as an output 
  }
}

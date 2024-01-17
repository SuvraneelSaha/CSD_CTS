package DebobrataSir_Java.StringFunctions;

public class O8 {
  public static void main(String[] args) {
    // check if a string contains a character sequence or a character or not 
    // using the .contains() method

    String str = "Fly me to the Moon";

    System.out.println(str.contains("yl"));

    System.out.println(str);

    // contains method returns boolean value 
    // it just checks if the char sequence is present or not 
    // if present - true else false 
    // and if the characters arranged in the charsequence are in reverse order 
    // then it will show false 
  }
}

package DebobrataSir_Java.StringFunctions;

public class O10 {
  public static void main(String[] args) {
    // turn a string into lowercase and uppercase respectively 

    String str = "www.Google.com";

    String lCase = str.toLowerCase();

    String uCase = str.toUpperCase();

    System.out.println(lCase);
    System.out.println(uCase);
    System.out.println(str);

    // public String toLowerCase() this is the function defination 
    // so it means that it makes a string of the given string which is passed 
    // as a parameter 
    // the original string does not get modified whereas a new object gets created 
    
  }
}

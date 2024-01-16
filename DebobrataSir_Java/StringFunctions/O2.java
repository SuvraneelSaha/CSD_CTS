package DebobrataSir_Java.StringFunctions;

public class O2 {
  public static void main(String[] args) {
    // Trim of a Given String 
    String str = "     Happpy    New Year    "; 

    String s = str.trim();

    System.out.println(s);
    

    System.out.println(str.trim());

    System.out.println(str);

    /*
     * Trim function does not change the original string , it just creates a new string if 
     * the str.trim() is assigned to some string value 
     * 
     * Function defination is public String trim()
     */
  }
}

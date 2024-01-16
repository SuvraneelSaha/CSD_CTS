package DebobrataSir_Java.StringFunctions;

public class O5 {
  public static void main(String[] args) {
    // enter a string and change a character with another character 

    String str = "Mohan Das Karan Chand Gandhi";

    String ans;

    ans = str.replace('a', 'X');

    System.out.println(ans);

    System.out.println("Check");
    
    System.out.println(str.replace('a', 'X'));

    System.out.println(str);

    // replace function finds the char or the char sequence and replaces the char or the char sequence 

    // But it does not modify the original string , it creates a new string 
  }
}

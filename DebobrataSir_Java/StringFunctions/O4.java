package DebobrataSir_Java.StringFunctions;

public class O4 {
  public static void main(String[] args) {
    String str = "FullStack Developer";

    String ans ="";

    for(char ch : str.toCharArray())
    {
      ans = ans + ch;
    }

    System.out.println(ans);

    str = str+"check";

    System.out.println(str);

    // this ans can be done using the charAt() function also 
    // but also we can change the string ie here str .tocharArray() and use the characters and 
    // the characters in a string 
  }
}

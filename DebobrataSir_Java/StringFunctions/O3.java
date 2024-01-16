package DebobrataSir_Java.StringFunctions;

public class O3 {
  public static void main(String[] args) {
    // enter two strings and output the ascii difference between them 
    // use the function compareTo()
    String str1 = " Apple  ";

    String str2 ="Zpple  ";

    int n = str1.trim().compareTo(str2.trim());
    System.out.println(n);


    // there are 26 alphabets in English Language and 
    // A - 65 
    // a - 97 

    // the str1 - str2 will be the ans 
    // if str.length()  > str2.length() then it will be ans 
    // vice versa 

    // otherwise if same length then lexicographically difference 
  }
}

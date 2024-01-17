package DebobrataSir_Java.StringFunctions;

public class O11 {
  public static void main(String[] args) {
    // enter two strings and find if they are same or not 
    // (case sensitive) 
    // use equals() method to check 
    String str1 = "Welcome";
    String str2 ="welcome";

    String str3 = str1;

    System.out.println("s1 with s2"+str1.equals(str2));

    System.out.println("s1 with s3"+str1.equals(str3));

    System.out.println(str1.equals("Welcome"));

    //public boolean equals(Object anotherObject)
    // gives boolean output .
    
  }
}

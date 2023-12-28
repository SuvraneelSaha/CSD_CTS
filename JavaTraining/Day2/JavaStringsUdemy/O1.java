package JavaTraining.Day2.JavaStringsUdemy;

import java.util.Scanner;

public class O1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in) ; 

    String name = "John" ; 
    String name1 = new String("John") ; 
    // internally there is difference between these 2 statements 


    // two ways of declaring of strings 

    System.out.println(name);

    System.out.println(name1);


    // length of a string 

     int x = 10; 
    //  x. primitive data type 

    // length of a string 

    System.out.println(name.length());

    // in arrays we use .length not length() ie function or method 
// john -- 4 total nums of characters 

// length() returns length of a string 



// concat() - for joining strings 

// all classes start with capital letters 
String s1 = "Welcome" ; 
String s2 = "to java" ; 

System.out.println(s1+s2);

System.out.println(s1.concat(s2));

// concatenation of strings 

String s3 = "Development" ; 

System.out.println(s1+s2+s3);

System.out.println(s1.concat(s2).concat(s3));

// whenever we are working with strings use string methods 


// as s1 is already declared at the beginning 
// we can change the value at any time 
s1 = "    FSE   " ;
// now we want just the content , only the value 
// there are spaces in the right and left side 
// we want to remove the spacess

// for which we use trim()

System.out.println(s1);

System.out.println(s1.length());

System.out.println(s1.trim());

System.out.println(s1.trim().length());

// in case of strings the methods / or functions 
// do not modify the original or the actual datatype 


// charAt() - returns a single char based on index we passed on 

s1 = "Welcome" ; 

System.out.println(s1.charAt(0));

// o/p - W 

// contains() - returns the boolean true/false 

// whenever we want to check if the string contains 
// some value is present in the string or not 

System.out.println(s1.contains("Wel")); // true

System.out.println(s1.contains("com")); // true

System.out.println(s1.contains("wel"));  // false 

// in case of strings - it is case insensitive 


// strings are case sensitive 
// if we want to find if something is present in the
// string or not we use contains 



// equals() and equalsIgnoreCase() - compare 2 strings 

s1 = "WELCOME" ; 

s2 = "welcome" ; 

System.out.println(s1.equals(s2)); // false 

System.out.println(s1.equalsIgnoreCase(s2)); // true 

// equals() considers case sensitivity 
// equalsIgnoreCase() - doesnt considers case sensitivity 












  }
  
}

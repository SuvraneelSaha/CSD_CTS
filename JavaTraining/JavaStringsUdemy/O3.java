package JavaTraining.JavaStringsUdemy;

import java.util.*;

public class O3 {

  public static void main(String[] args) {
    
    String s = "Welcome to java FSE Development";

    // replace() function 

    System.out.println(s.replace('e','X'));

    //the actual original string does not gets changed 
    // a new string is created 

    String snew = s.replace('e', 'X') ; 

    System.out.println(s);

    System.out.println(snew);

    // the replace() func makes a new string out of the string that is used 


    // replace sequence of characters ie sequentially 

    System.out.println(s.replace("java", "JS"));


    // substring 

    // use this method substring from the main string 


    /*
      str = "Welcome";

      pass starting and ending index numbers 

      substring(s,e) ; 

      Welcome
      0123456

      we want from c to e 

      substring(3,7) ;
      // ending index - 7 
      // come 

      substring(2,6)
      // in between 
      // lcom 


      substring(0,3)
      // wel





     */


     String str = "Welcome";

     System.out.println(str.substring(2,5));

    // welcome
     System.out.println(str.substring(0,6));
    // welcom 

    // the characters which is between the range , the chars will be returned 

    // Split Function 
    // divide the string into multiple parts using delimeter 
    String ss ; 



  }
}
package JavaTraining.Week3.Day1;

import java.util.Scanner;

public class O4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    StringBuffer sb = new StringBuffer("cat");
    sb.reverse();
    System.out.println(sb);
    // when we use the stringbuffer's reverse function 
    // it changes the whole data 
    System.out.println(sb+":"+sb.reverse());


    // StringBuffer Class and StringBuilder class 

    System.out.println("Another Example");

    StringBuffer sb1 = new StringBuffer("Dog");

    System.out.println(sb1+":"+sb1.reverse());

// StringBuffer is mutable 
// the Objects that are used can be changed as the objects that are stored via the 
// StringBuffer are mutable 



  }
}

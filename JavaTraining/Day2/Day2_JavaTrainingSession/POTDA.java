package JavaTraining.Day2.Day2_JavaTrainingSession;

import java.util.Scanner;

public class POTDA {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a String :");

    String str = in.nextLine();

    StringBuffer str1 = new StringBuffer();

    str1.append(str) ; 

    str1.reverse();
    // physically reverse of the string 

    System.out.println(str1);

    String str2 = str1.toString() ; 

    System.out.println(str2.equals(str) ? "Palindrome" : "NA");
  }
}

package JavaTraining.Day1;

import java.util.Scanner;

public class O11_AsciiValueOfCharacter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter A character : ");

    char ch1 = in.next().charAt(0);

    int a = ch1 ; 

    System.out.println(a);

    char ch2 = 'b';
    int b = (int) ch2 ; 

    System.out.println(b);

    
  }
}

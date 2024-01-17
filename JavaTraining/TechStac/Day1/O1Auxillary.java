package JavaTraining.TechStac.Day1;

import java.util.Scanner;

public class O1Auxillary {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the no of students placed in CSE:");
    int cs = in.nextInt();
    System.out.println("Enter the no of students placed in ECE:");
    int ec = in.nextInt();
    System.out.println("Enter the no of students placed in MECH:");
    int mec = in.nextInt();

    int ans = 0 ; 
    ans = Math.max(Math.max(ec, mec),cs);

    System.out.println(ans);
  }
}

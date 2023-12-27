package JavaTraining.Day1;

import java.util.Scanner;

public class O10_RandomNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    System.out.println(n);

    double random =  Math.random();
    
    System.out.println(random);

    System.out.println("Enter max and min:");

    int max = in.nextInt();

    int min = in.nextInt();

    double a = Math.random()*(max-min+1) + min ; 
    System.out.println(a);


    int b = (int)(Math.random()*(max-min+1)+min);

    System.out.println(b);

    

  }
  
}

package JavaTraining.TechStac.Day1;

import java.util.Scanner;

public class O2Auxillary {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Litres");
    int liters = in.nextInt();
    System.out.println("distance");
    int distance = in.nextInt();

    float litersKilometer; 

    float liters1 = liters;

    float distance1 = distance;

        litersKilometer = (float)(liters1/distance1);

        System.out.println(litersKilometer);

        litersKilometer = (float)(litersKilometer * 100) ; 

        System.out.println("Liters/100KM");

        System.out.printf("%.2f",litersKilometer);
  }
}

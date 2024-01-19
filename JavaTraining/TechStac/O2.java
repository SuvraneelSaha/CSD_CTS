package JavaTraining.TechStac;

import java.util.Scanner;

public class O2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


    System.out.println("Enter the no of liters to fill the tank");
    int liters = Integer.parseInt(in.nextLine());

    if(isPositive(liters) == true)
    {
      System.out.println("Enter the distance covered");
      int distance = Integer.parseInt(in.nextLine());
      if(isPositive(distance)==true)
      {
        float litersKilometer; 

        float liters1 = liters;

        float distance1 = distance;

        litersKilometer = (float)(liters1/distance1);

       

        litersKilometer = (float)(litersKilometer * 100) ; 

        System.out.println("Liters/100KM");

        System.out.printf("%.2f",litersKilometer);

        System.out.println();

        float milesGallons;

        float miles = (float)(distance * 0.6214);

        float gallons = (float)(liters*0.2642);

        milesGallons = miles/gallons ; 

        System.out.println("Miles/gallons");

        System.out.printf("%.2f",milesGallons);

      }
      else
      {
        System.out.println(distance+" is an Invalid Input");
      }


    }

    else
    {
      System.out.println(liters+" is an Invalid Input");
    }
    in.close();
  }
  public static boolean isPositive(int n)
  {
    if(n<=0)
    {
      return false;
    }
    else
    {
      return true;
    }
  }
}

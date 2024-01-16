package JavaTraining.Week4.Day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class O10 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


    Map<String,String> ProductDetails =new LinkedHashMap<String,String>();
    Map<String,Integer> salesDetails =new LinkedHashMap<String,Integer>();

    System.out.println("Enter the number of Objects : ");
    int n = in.nextInt();
    in.nextLine();

    for (int i = 0; i < n; i++)
    {
      System.out.println("Enter the Key");
      String strKey = in.nextLine();  

      System.out.println("enter the value");
      String strValue = in.nextLine();

      ProductDetails.put(strKey, strValue);

    }

    System.out.println(ProductDetails);

    for (int i = 0; i < n; i++)
    {
      System.out.println("Enter the Key");
      String strKey = in.nextLine();  

      System.out.println("enter the Price");
      int price = Integer.parseInt(in.nextLine());

      salesDetails.put(strKey, price);
    }

    System.out.println(salesDetails);

    ArrayList<String> list = new ArrayList<String>();

    
    // these are the two objects entry and entry2 

    System.out.println(ProductDetails.keySet());

    System.out.println(salesDetails.keySet());

  Set<String> s = new HashSet<>();

  s = salesDetails.keySet();

  for (int i = 0; i < s.size(); i++)
  {
      System.out.println();

  }
    

  }
}

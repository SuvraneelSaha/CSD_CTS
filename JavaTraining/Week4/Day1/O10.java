package JavaTraining.Week4.Day1;

import java.util.*;

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
      System.out.println("Enter the Product");
      String product = in.nextLine();  

      System.out.println("enter the Category");
      String category = in.nextLine();

      ProductDetails.put(product, category);

    }
    System.out.println(ProductDetails);
    for (int i = 0; i < n; i++)
    {
      System.out.println("Enter the Product");
      String product = in.nextLine();  

      System.out.println("enter the Price");
      int price = Integer.parseInt(in.nextLine());

      salesDetails.put(product, price);
    }
    System.out.println(salesDetails);

  }

  public static void getMaxSold(Map<String,String> ProductDetails,Map<String,Integer> salesDetails)
  {
   Set<String> list = new HashSet<String>();
 
    Set<String> category = new HashSet<String>();

    category = ProductDetails.keySet();

    for (String name : ProductDetails.keySet())  
    {
      int maxValue = 0 ; 
      String productName = null;
      for(String s : category)
      {
        if(name.equals(s))
        {
          if(ProductDetails.get(name).equals(category))
          {

          }
        }
      }
    }

  //return list;

  }
}

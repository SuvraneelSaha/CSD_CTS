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
    for (int i = 0; i < n; i++)
    {
      System.out.println("Enter the Product");
      String product = in.nextLine();  
      
      System.out.println("enter the Price");
      int price = Integer.parseInt(in.nextLine());
      
      salesDetails.put(product, price);
    }


    System.out.println("Product Details"+ProductDetails);


    System.out.println("Sales Details"+salesDetails);

    System.out.println(getMaxSold(ProductDetails, salesDetails).toString());

    
    
  }

  public static Set<String> getMaxSold(Map<String,String> ProductDetails,Map<String,Integer> salesDetails)
  {

   Set<String> list = new LinkedHashSet<String>();
 
    Set<String> categoryList = new LinkedHashSet<String>(ProductDetails.values());

    //categoryList = ProductDetails.keySet();

    //ProductDetails.values()

    // this was the bug 
    for(String category : categoryList)
    {
      String pdtName = "";
      int maxSold = 0 ;

      for(Map.Entry<String,String> e : ProductDetails.entrySet())
      {
        String key = e.getKey();
        String value = e.getValue();

        if(value.equals(category))
        {
          int v = salesDetails.get(key);

          if(v > maxSold)
          {
            maxSold = v ; 
            pdtName = key ; 
          }

        }

      }
      list.add(pdtName);
      System.out.println(list.toString());
    }
    return list;
  }
}

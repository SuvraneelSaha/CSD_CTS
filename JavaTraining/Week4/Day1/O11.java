package JavaTraining.Week4.Day1;

import java.util.*;;

public class O11 {
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

    System.out.println(getMaxSales(ProductDetails, salesDetails));
  }


  public static Set<String> getMaxSales(Map<String,String> productDetails,Map<String,Integer>salesDetails)
  {
    Set<String> categoryList = new LinkedHashSet<String>(productDetails.values());

    Set<String> pdtList = new LinkedHashSet<String>();


    

    for(String category : categoryList)
    {
      String pdtName = "";
      int maxSold = 0 ;

      for(Map.Entry<String,String> e : productDetails.entrySet())
      {
        String key = e.getKey();
        String value = e.getValue();

        if(value.equals(category))
        {
          int value1 = salesDetails.get(key);

          if(value1 > maxSold)
          {
            pdtName = key;
            maxSold = value1;
          }
        }

      }

      pdtList.add(pdtName);	
    }

    return pdtList;

  }
}

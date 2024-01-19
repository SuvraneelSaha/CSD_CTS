package JavaTraining.TechStac;
import java.util.Arrays;
import java.util.Scanner;

public class O5 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int n = Integer.parseInt(in.nextLine());

    String[] pName = new String[n];

    int[] pPrice = new int[n];

    int[] pRate = new int[n];

    int[] pDiscount = new int[n];



    for (int i = 0; i < n; i++)
    {
      String input = in.nextLine();

      String[] str=input.split("[,]+"); 

       System.out.println(Arrays.toString(str));

       System.out.println(str[0]);

       String keyName = str[0];

       int price = Integer.parseInt(str[1]);

       int rate = Integer.parseInt(str[2]);

       int discount = (price * rate)/100;

       pName[i] = keyName;
       pPrice[i] = price;
       pRate[i] = rate;
       pDiscount[i] = discount;
    }

    System.out.println("Product Name"+Arrays.toString(pName));
    System.out.println("Product Price"+Arrays.toString(pPrice));
    System.out.println("Product Discount Rate"+Arrays.toString(pRate));
    System.out.println("Product Discount"+Arrays.toString(pDiscount));

    int low = pDiscount[0] ; 
    int lowIndex;
    for (int i = 1; i < pDiscount.length; i++)
    {
      if(pDiscount[i] < low)
      {
        low = pDiscount[i];
        lowIndex = i;
      }
    }

    for (int i = 0; i < n; i++)
    {
      if(low==pDiscount[i])
      {
        System.out.println(pName[i]);
      }  
    }



  }
}

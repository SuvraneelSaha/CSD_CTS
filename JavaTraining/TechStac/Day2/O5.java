import java.util.*;
import java.util.Map.Entry;
public class O5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int n = Integer.parseInt(in.nextLine());

    TreeMap<Integer,String> map = new TreeMap<>();

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

        map.put(discount,keyName);

    }

    int lowDiscount = map.firstKey();

    System.out.println(lowDiscount);
   
   for(Map.Entry<Integer,String> e : map.entrySet())
   {
      if(lowDiscount==e.getKey())
      {
        System.out.println(e.getValue());
      }
   }
   


    
  }
}

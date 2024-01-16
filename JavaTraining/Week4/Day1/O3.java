package JavaTraining.Week4.Day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class O3 {
  public static void main(String[] args) {
    Map<Integer,String> hm = new LinkedHashMap<Integer,String>();

    hm.put(1001, "abc");
    hm.put(1045, "efg");
    hm.put(1023, "mno");
    hm.put(1001, "xyz");
    hm.put(1045, "niggs");
    // as the key is also the same 
    // it will just replace the previous value 
    
    System.out.println(hm);


    
  }
}

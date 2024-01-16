package JavaTraining.Week4.Day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class O8 {
  public static void main(String[] args) {
    Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();

    String str = "Welcome";

    for (int i = 0; i < str.length(); i++)
     {
        char key = str.charAt(i);
        
        hm.put(key,hm.getOrDefault(key, 0)+1);
    }

    System.out.println(hm);

    
  }
}

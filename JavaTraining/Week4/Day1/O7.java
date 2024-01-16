package JavaTraining.Week4.Day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class O7 {
  public static void main(String[] args) {
     Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();

    String str = "Welcome";

    for (int i = 0; i < str.length(); i++)
    {
      char key = str.charAt(i);


        if(hm.containsKey(key))
        {
          Integer value  = hm.get(key);
          hm.put(key,++value);

        }
        else
        {
          hm.put(key, 1);
        }


    }
    System.out.println(hm);
  }
}

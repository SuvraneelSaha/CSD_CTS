package JavaTraining.Week4.Day1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class O9 {
  public static void main(String[] args) {
    Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();

    String str = "Welcome";

    for (int i = 0; i < str.length(); i++)
     {
        char key = str.charAt(i);
        
        hm.put(key,hm.getOrDefault(key, 0)+1);
        // if nothing is present 0+1 
        // else if present increment it by 1 value
    }

    System.out.println(hm);

    Iterator<Character> itr = hm.keySet().iterator();

    while (itr.hasNext())
     {
        char key = itr.next();
        System.out.println(key+"-"+hm.get(key));  
    }


    System.out.println("New Way of Iteration of the hashmap");
    for(Entry<Character,Integer> e : hm.entrySet())
    {
      System.out.println(e.getKey()+"-"+e.getValue());
    }


  }
}

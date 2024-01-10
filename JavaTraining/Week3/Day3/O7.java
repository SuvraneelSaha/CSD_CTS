package JavaTraining.Week3.Day3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class O7 {
  public static void main(String[] args) {
    int[] arr = {1,3,1,4,5,2,4};

    Set<Integer> uniq = new LinkedHashSet<Integer>();
    // using this we wont have any duplicate eleemnts 

    for(int v : arr)
    {
      uniq.add(v);
    }

    System.out.println(uniq);


    Iterator<Integer> itr = uniq.iterator();

    while (itr.hasNext())
     {
      System.out.println(itr.next());  
    }


  }
  
}

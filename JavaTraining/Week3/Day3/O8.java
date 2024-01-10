package JavaTraining.Week3.Day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class O8 {
  public static void main(String[] args) {
    int[] arr = {1,3,1,4,5,2,4};

    Set<Integer> uniq = new LinkedHashSet<Integer>() ; 

    Set<Integer> dups = new LinkedHashSet<Integer>();

    for(int value : arr)
    {
      if(!(uniq.add(value)))
      {
        dups.add(value);
      }
    }

    uniq.removeAll(dups);

    System.out.println(uniq);
    System.out.println(uniq.size());
    
  }
}

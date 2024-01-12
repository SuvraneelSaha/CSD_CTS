package JavaTraining.Week3.Day5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class O3 {
  public static void main(String[] args) {
    Set<Integer> uniq = new TreeSet<Integer>(Comparator.reverseOrder()) ; 
    // Comparator.reverseOrder() in the argument 
    // using this we can reverse the order 
    
    uniq.add(12);
    uniq.add(11);
    uniq.add(15);
    uniq.add(22);

    System.out.println(uniq);

  }
}

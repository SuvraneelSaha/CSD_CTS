package JavaTraining.Week3.Day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class O2 {
  public static void main(String[] args) {
    // Comparable and Comparator 
    // Map 
    // Sample Programs 
    // Packages and Access Specifiers 

    List<Integer> list1 = new ArrayList<Integer>();

    list1.add(1);
    list1.add(22);
    list1.add(2);
    list1.add(11);
    list1.add(32);
    list1.add(5);

    // using the List we can sort an array of elements 
    Collections.sort(list1);

    System.out.println(list1);
    
    // we can also reverse it also 
    Collections.reverse(list1);
    System.out.println(list1);


  }
}

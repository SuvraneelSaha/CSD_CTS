package JavaTraining.Week3.Day3;

import java.util.ArrayList;
import java.util.List;

public class O3 {
  public static void main(String[] args) {
    int[] a = {11,12,13};

    int[] b = {110,12,13};


    int sum = 0 ; 
    List<Integer> list1 = new ArrayList<Integer>();

    List<Integer> list2 = new ArrayList<Integer>();

    for(int value : a)
    {
      list1.add(value);

    }

    for(int v : b)
    {
      list2.add(v);
    }
    list1.retainAll(list2);
    for(int v : list1)
    {
      sum = sum + v ; 
    }

    System.out.println(sum);

  }
}

package JavaTraining.Week3.Day2;

import java.util.ArrayList;

import java.util.List;

public class O5SumOfCommonElementsUsingList {
  public static void main(String[] args) {
    int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		System.out.println(commonElementSum(a, b));
  }
  public static int commonElementSum(int[] a,int[] b) {
    //Fill code here
    List<Integer> list1 = new ArrayList<Integer>();

    List<Integer> list2 = new ArrayList<Integer>() ; 

    for (int i : a)
    {
      list1.add(i);
    }

    for (int i : b)
    {
      list2.add(i);
    }

    list1.retainAll(list2);
    int sum = 0 ; 
    for(Integer i : list1)
    {
      sum = sum + i ; 
    }

    return sum ; 


  }
}

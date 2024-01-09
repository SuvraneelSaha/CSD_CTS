package JavaTraining.Week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class O4 {
  public static void main(String[] args) {
    List<Integer> lst1=new ArrayList<Integer>();
	lst1.add(11);
	lst1.add(12);
	lst1.add(13);
	List<Integer> lst2=new ArrayList<Integer>();
	lst2.add(110);
	lst2.add(12);
	lst2.add(13);
	//lst1.removeAll(lst2);
	//lst1.retainAll(lst2);
	//lst2.retainAll(lst1);
	lst2.removeAll(lst1);
	System.out.println(lst2);
	  }
  }


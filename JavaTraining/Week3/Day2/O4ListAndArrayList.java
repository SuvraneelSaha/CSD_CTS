package JavaTraining.Week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class O4ListAndArrayList {
  public static void main(String[] args) 
	{


  List<Integer> lst1=new ArrayList<Integer>();
	lst1.add(11);
	lst1.add(12);
	lst1.add(13);
	System.out.println(lst1);


	List<Integer> lst2=new ArrayList<Integer>();
	lst2.add(110);
	lst2.add(12);
	lst2.add(13);
	System.out.println(lst2);


	// lst1.removeAll(lst2);
	// System.out.println(lst1);


	// lst1.retainAll(lst2);
	// System.out.println(lst1);
	// common from both of the lists 
	// the list gets modified and the common of both the lists gets into the list 


	// lst2.retainAll(lst1);
	// System.out.println(lst2);
	// takes the common elements from both of the lists and 
	// puts them in the list 


	lst1.removeAll(lst2);
	System.out.println(lst1);
	// removes all the common elements that are present in the both the lists 
	// ex - list1 - [11,12,13]
	// list2 - [110,12,13]
	// so the elements that will be deleted will be 12,13 as list1.removeAll(list2)
	// and the elements that will remain in the list is - 11
		}
  }


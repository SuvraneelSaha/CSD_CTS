package JavaTraining.Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class O3_CollectionsIntroduction {
  public static void main(String[] args) {
    	/*Dynamic Binding*/
		List<Integer> lst=null;
		lst=new ArrayList<Integer>();
		lst =new LinkedList<Integer>();

		Integer a[]= {1,2,3};//Wrapper class Array
		lst=Arrays.asList(a);


		Float f[]= {9.9f,9.8f};
		List<Float> floatList=Arrays.asList(f);

		System.out.println(floatList);
		int aa[]= {1,2,3};//primitive array
		List<Integer> lst1=new ArrayList<Integer>();
		for(int value:aa) {
			lst1.add(value);
		}


		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}


		for(int val:lst) {
			System.out.println(val);
		}


		Iterator<Integer> itr=lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


  }
}

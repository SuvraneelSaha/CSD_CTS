package JavaTraining.Week4.Day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner; 

public class O5 {
  public static void main(String[] args) {
    Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		hm.put('a',1);
		hm.put('b',2);
		hm.put('c',1);
		hm.put('d',1);
	    Scanner input=new Scanner(System.in);
	    char key=input.nextLine().charAt(0);
	    System.out.println(hm.containsKey(key));
	    System.out.println(hm.get(key));
	    System.out.println(hm.get('b'));//2
	    hm.get('l');//null
		System.out.println(hm);
  }
}

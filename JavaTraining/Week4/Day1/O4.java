package JavaTraining.Week4.Day1;

import java.util.*;
public class O4 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Map<Character,Integer> hm = new LinkedHashMap<Character,Integer>();

    hm.put('a', 1);
    hm.put('b', 1);
    hm.put('c', 1);
    hm.put('d', 1);
    System.out.println(hm);

    char key = in.nextLine().charAt(0);

    System.out.println(hm.containsKey(key));

    System.out.println(hm.get(key));

    hm.get('b');

    // in get method we can only pass the key method 

    hm.get('l');

    System.out.println(hm);

    
  }
  
}

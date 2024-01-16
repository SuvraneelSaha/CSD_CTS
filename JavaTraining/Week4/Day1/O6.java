package JavaTraining.Week4.Day1;

import java.util.LinkedHashMap;
import java.util.Map;

/*
		 * Write a program to get a word as input and find the occurance of each characters
		 * Sample Input
		 * Welcome
		 * Sample Output
		 * {W=1,e=2,l=1,c=1,o=1,m=1}
		 */		
public class O6 {
  public static void main(String[] args) {
    Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();

    String str = "Welcome";

    for(int i = 0 ; i < str.length();i++)
    {
      if(hm.containsKey(str.charAt(i)))
      {
        
      }
      else
      {
        hm.put(str.charAt(i), 1);
      }
    }

  }
}

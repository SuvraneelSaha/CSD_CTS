package JavaTraining.Week3.Day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class O9 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = "welcome";

    Set<Character> uniq = new HashSet<Character>();

    Set<Character> dups = new HashSet<Character>();

    


    for(int i = 0 ; i<str.length();i++)
    {
      if(!(uniq.add(str.charAt(i))))
      {
        dups.add(str.charAt(i));

      }
    }

    uniq.removeAll(dups);
    // display all unique characters 

    System.out.println(uniq);

    System.out.println(dups.size());
    // number of duplicate characters 
    in.close();

  }
}

package JavaTraining.Week4.Day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class O13 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the HashMap");
    int n = Integer.parseInt(in.nextLine());

    Map<Integer,Integer> studentMarks = new LinkedHashMap<Integer,Integer>();

    for (int i = 0; i < n; i++)
    {
      System.out.println("Enter the Rollno");
      int rno = Integer.parseInt(in.nextLine());
      
      System.out.println("Enter the Marks");
      int marks = Integer.parseInt(in.nextLine());

      studentMarks.put(rno, marks);

    }

    System.out.println(studentMarks);

    ArrayList<Integer> arr = new ArrayList<Integer>();

    for(Map.Entry<Integer,Integer> e : studentMarks.entrySet())
    {
      arr.add(e.getValue());

    }

    Collections.sort(arr);
    int sum = 0 ;
    for(int i = 0 ; i < 3 ; i++)
    {
      sum = sum + arr.get(i);
    }

    System.out.println(sum);
    



  }
}

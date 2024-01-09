package JavaTraining.Week3;

import java.util.Scanner;

public class O1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
  
    System.out.println(getNewString(str));

  }
  public  static  String getNewString(String str)
	{
		//Fill code here
    String ans = "";
    // Rabbit 

    int i = 0 ;
    for (; i < str.length()-1; i++) 
    {
      char ch = str.charAt(i);
      
      ans = ans + ch + "-";


    }

    ans = ans + str.charAt(i);
    if(ans.isEmpty())
    {
      return null;

    }
    else
    {
      return ans;
    }
}
}
/*
	 * Write a program to get input as String and display the output as follows
	 * Sample Input
	 * Rabbit
	 * Sample output
	 * R-a-b-b-i-t
	 */

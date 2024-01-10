package JavaTraining.Week3.Day1;

import java.util.Scanner;

public class O3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = in.nextLine();

    System.out.println(getNewString(str));



  }
  public static String getNewString(String str)
  {
    String ans = "";

    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < str.length(); i++)
    {
      sb.append(str.charAt(i) + "-");  
    }

    sb.deleteCharAt(sb.length()-1);

    ans = sb.toString();

    return ans ; 

  }
}

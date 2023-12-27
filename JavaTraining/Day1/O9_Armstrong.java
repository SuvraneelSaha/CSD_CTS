package JavaTraining.Day1;

import java.util.Scanner;

public class O9_Armstrong {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(isArmstrong(n));
    
  }
  public static boolean isArmstrong(int n )
  {
    
    String str = Integer.toString(n);
  
    int power = str.length();
  
    // System.out.println(power);
    int sum = 0 ; 
    int ans = n ; 
  
    while (n>0)
    {
      int rem = n%10 ; 
  
      sum = sum + (int)Math.pow(rem, power); 
  
      n=n/10;
  
  
    }
  
    if(sum == ans)
    {
      return true ;
    }
    else
    {
      return false ; 
    }
  }
  
}

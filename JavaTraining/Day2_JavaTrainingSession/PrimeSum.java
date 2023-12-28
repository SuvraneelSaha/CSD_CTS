package JavaTraining.Day2_JavaTrainingSession;
import java.util.*;
public class PrimeSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a prime number ");
    
    int n = in.nextInt();

    System.out.println("Sum is "+sumPrime(n));
    in.close();

  }

public static int sumPrime(int n)
{

  int num = n ; 
  int sum = 0 ; 

  if(isPrime(num) == false)
  {
    return sum ;
  }
 
  while(n>=0)
  {
    int rem = n % 10 ; 

    if(isPrime(rem) == true)
    {
      sum = sum + rem ; 
    }

    n = n/10 ; 

    }  
    return sum ; 
  }


  public static boolean isPrime(int n)
  {
    if(n<=2)
    {
      return false ; 
    }

    int c = 2 ; 

    while (c*c<=n)
    {
      if(n%c==0)
      {
        return false ; 
      } 
      c++; 
    }

    return true;
  }


}

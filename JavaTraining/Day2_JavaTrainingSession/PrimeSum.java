package JavaTraining.Day2_JavaTrainingSession;
import java.util.*;
public class PrimeSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a prime number ");
    
    int n = in.nextInt();

    System.out.println("Sum is "+sumPrime(n));

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


  public static int sumPrime(int n)
{

  // if(isPrime(n) == false)
  // {
  //   return 0 ;
  // }
 
  int sum = 0 ; 
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


}

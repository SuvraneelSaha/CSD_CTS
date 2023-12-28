package JavaTraining.Day2_JavaTrainingSession;

import java.util.Scanner;

public class Prime 
{
  public static void main(String[] args) {
    // take an input and find whether the num is prime or not 

    Scanner in = new Scanner(System.in);

    System.out.println("Enter a num : ");

    int n = in.nextInt();


    // by using the function isPrime

    System.out.println(isPrime(n));


    // using the given code 

    isPrimeTrainer();

    System.out.println("count of Prime numbers in a range : ");

    System.out.println("Enter the lower limit : ");

    int a = in.nextInt();

    System.out.println("Enter the upper limit : ");

    int b = in.nextInt(); 

    System.out.println("The number of prime Numbers in the range "+a+" and "+b+" is "+countPrime(a, b));

    System.out.println("Sum of Prime Numbers in a Prime Number : ");

    System.out.println("Enter a prime number : ");
     int cc = in.nextInt();

     System.out.println("The sum is "+sumPrime(cc));

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

  public static void isPrimeTrainer()
  {
    int num;
		boolean isPrime = true;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if (num == 0 || num == 1) {
			isPrime = false;
		} else {
			for (int j = 2; j < num - 1; j++) {
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}
		}
 
		System.out.println(isPrime ? "Prime" : "Not a Prime");
  }

  // Find the Prime number Count between the given range
  public static int countPrime(int a , int b)
  {
    int count = 0 ; 
    for(int i = a ; i <=b; i++)
    {
      if(isPrime(i) == true)
      {
        count++;
      }
    }

    return count ; 
  }
  public static int sumPrime(int n)
{

  if(isPrime(n) == false)
  {
    return 0 ;
  }
  else
  {

  
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
}


// Write a program to find the sum of prime digit in the given number

// ex - 153 -- > ans = 5+3 = 8 


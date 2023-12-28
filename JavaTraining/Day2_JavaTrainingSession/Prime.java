package JavaTraining.Day2_JavaTrainingSession;

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    // take an input and find whether the num is prime or not 

    Scanner in = new Scanner(System.in);

    System.out.println("Enter a num : ");

    int n = in.nextInt();


    // by using the function isPrime

    System.out.println(isPrime(n));


    // using the given code 

    isPrimeTrainer();

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
}

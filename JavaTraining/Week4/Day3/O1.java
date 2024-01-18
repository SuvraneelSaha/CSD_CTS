package JavaTraining.Week4.Day3;
/*
 * Create a Calculator interface 
 * under which define a calculate method which takes in input as two integers 
 * 
 * create 3 classes under which the calculate function is defined and inside of which 
 each function does addition, substraction, multiplication respectively 

 in the main function the objects are created of the interface 
 and the function are called from the objects 
 
 * 
 */

public class O1 {
  public static void main(String[] args) {
    Calculator add = new Addition();
    Calculator sub = new Substraction();
    Calculator mul = new Multiplication();

      System.out.println("Addition "+add.calculate(5, 5));
      System.out.println("Substraction"+sub.calculate(10, 5));
      System.out.println("Multiplication"+mul.calculate(5, 5));
  }
}
// this is the interface 

interface Calculator {
int calculate(int a,int b);
  
}
 class Addition implements Calculator {

  public  int calculate(int a,int b)
  {
    return a+b;
  }
}

class Substraction implements Calculator{
  public  int calculate(int a , int b)
  {
    if(a>b)
    {
      return a-b;

    }
    else
    {
      return b-a;
    }
  }
}

class Multiplication implements Calculator{
  public  int calculate(int a,int b)
  {
    return a*b;

  }
}
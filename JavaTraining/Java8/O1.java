package JavaTraining.Java8;

public class O1 {
  public static void main(String[] args) {
    Calculator calc;

    /*
     * Once if the interface is functional interface 
     * (if the interface has only one method)
     * we can use lamda expression 
     */

     calc =(a,b)->a+b;

     System.out.println(calc.calculate(12, 3));
		/*
		 *  <anno>  implements Calculator{
		 *    
		 *       public int caluclate(int a,int b){
		 *          return a+b;
		 *       }
		 *    }
		 */

     calc=(a,b)->a/b;
     System.out.println(calc.calculate(12, 3));




  }
}
 class Addition implements Calculator{
  public int calculate(int a , int b)
  {
    return a+b;
  }
}

class Substraction implements Calculator{
  public int calculate(int a , int b)
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
class Division implements Calculator{
  public int calculate(int a , int b)
  {
   if(a>b)
   {
    return a/b;
   }
   else
   {
    return b/a;
   }
  }
}

@FunctionalInterface//this annotation inform to the compiler that the
//given interface is functional interface

interface Calculator {
public int calculate(int a , int b);
  


}
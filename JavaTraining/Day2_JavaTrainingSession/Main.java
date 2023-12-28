package JavaTraining.Day2_JavaTrainingSession;

public class Main {
  public static void main(String[] args) {
    byte byteValue = 0 ; 
    int intValue = 0 ; 
    float floatValue = 0 ; 
    double doubleValue = 0 ;
    char charValue = 0 ; 
    boolean booleanValue = false ;
    System.out.println(byteValue);
		System.out.println(intValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
		System.out.println(charValue);
		System.out.println(booleanValue);

    /*
     byte < int < float < double 
     from byte to double we can store the value using implicit ie it will be 
     done automatically (implicit typecasting)

     whereas from double to byte - it will be like explicit type casting 


     */

     int x = 100 ; 

     byte b = (byte) x ; 
     // this is explicit type casting 

     byte bb = 69 ; 

     int bbi = bb ; 
     // this is implicit type casting 
    

     System.out.println("ascii values");

     char ch = 'a' ; 
     System.out.println(ch);

     int chh = ch ; 
     System.out.println(chh);

  }
}

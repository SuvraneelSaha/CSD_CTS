package JavaTraining.Day2_JavaTrainingSession;

public class Main1 {


  // Instance Variables

  byte byteValue ;
  int intValue ;
  float floatValue ;
  double doubleValue ;
  char charValue ;
  boolean booleanValue ;
  // we can use these variables anywhere inside of this class 

  public static void main(String[] args) {
    Main1 obj = new Main1() ; 

    obj.byteValue = (byte)obj.intValue ; 

    System.out.println(obj.byteValue); // 0 
		System.out.println(obj.intValue); // 0 
		System.out.println(obj.floatValue); // 0.0 
		System.out.println(obj.doubleValue); // 0.0
		System.out.println(obj.charValue); // space null character 
		System.out.println(obj.booleanValue); // false 
    


  }
}

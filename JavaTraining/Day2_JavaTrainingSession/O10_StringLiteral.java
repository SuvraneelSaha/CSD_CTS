package JavaTraining.Day2_JavaTrainingSession;

public class O10_StringLiteral {
  public static void main(String[] args) {
    

    // String by literal 
    String str = "welcome" ; 

    String str1 = "Welcome" ; 

    // String by reference ; 
    String str2 = new String("welcome") ; 
        String str3 = new String("Welcome") ; 

        System.out.println("str and str1");
    System.out.println(str==str1);
    System.out.println(str == str2);


    System.out.println("str1 and str3");
    System.out.println(str1 == str3);


    // this == operator is used to compare the reference of the two objects 

    

  }
}

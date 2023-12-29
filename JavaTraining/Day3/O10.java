 package JavaTraining.Day3;

public class O10 {

  public static void main(String[] args) {
    
    String str = "wel3ce2om5e";

    System.out.println(str.length());


    // we have to remove the numbers
    // 

    String str1 = str.replaceAll("[^0-9]","");

    System.out.println(str1);

    System.out.println(str1.length());
    
  }
}
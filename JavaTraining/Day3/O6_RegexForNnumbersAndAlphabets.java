package JavaTraining.Day3;

public class O6_RegexForNnumbersAndAlphabets {
  public static void main(String[] args) {
    String marksDetails = "Java98Sql100";
    /*
     filter only the subject details 

     [] represent a character 

     0-9 any number 

     [0-9] means it is a single digit 

     [0-9]+ - means n number of digits 
     */

     String subjects[] = marksDetails.split("[0-9]+");

     for(String sub : subjects)
     {
      System.out.println(sub);

     }

     System.out.println("New :");

     String marks[] = marksDetails.split("[a-zA-z]+");

     for(String mark : marks)
     {
      System.out.println(mark);
     }

  }
}

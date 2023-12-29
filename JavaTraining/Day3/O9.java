package JavaTraining.Day3;

public class O9 {
  public static void main(String[] args) {
    /*
      any number - [0-9]+

      alphabets - [a-zA-Z]+

      statement - [a-zA-Z]+

      A word should not contain any number - 
      [^0-9]+

      ^ means other than 0-9 n number of times for which we use + symbol 


    */

    String cCode = "CSDCIS24CID007";

    

    System.out.println(cCode.matches("[A-Z]{6}[0-9]{2}[A-Z]{3}[0-9]{3}"));

// .matches() gives true or false value ; 

  }
}

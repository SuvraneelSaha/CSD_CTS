package JavaTraining.Day3;

public class O1 {
  public static void main(String[] args) {
    // Welcome

    // W*e*l*c*o*m*e*

    // it will create n number of strings 

    // methods of the String class

    String s1 = new String("Welcome");

      System.out.println(s1.charAt(0));
    // index as a value 

    System.out.println(s1.indexOf('W'));

    // gives the index of a character which is present in the string 
    
    System.out.println(s1.indexOf("e"));


    System.out.println(s1.lastIndexOf("e"));


    System.out.println(s1.indexOf("#"));
    System.out.println(s1.lastIndexOf("#"));

    // if a character is not present in the string 
    // then the o/p will be -1 
    
    // System.out.println("index of "+s1.indexOf('e', 2));

    // System.out.println("index of "+s1.indexOf('e',s1.indexOf('e', 0)));

    System.out.println("indexOf"+s1.indexOf('e',2));
    //System.out.println("indexOf"+s1.indexOf('e',s1.indexOf('e')+1));
    System.out.println(s1.indexOf('#'));
    System.out.println(s1.lastIndexOf('#'));

  }
}

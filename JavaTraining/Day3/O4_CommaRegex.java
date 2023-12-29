package JavaTraining.Day3;

public class O4_CommaRegex {
  public static void main(String[] args) {
    String product = "p1,abc,nigg,89.0as";

    String[] pds = product.split(",");
    // split function takes in the regex 
    // [] brackets represent a character - which in here is the . 

    
    System.out.println(pds.length);

    for(String p : pds)
    {
      System.out.println(p);
    }

  }

  
}

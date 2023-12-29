package JavaTraining.Day3;

public class O5 {
  public static void main(String[] args) {
    String product = "p1$abc$nigg$89$0as";

    String[] pds = product.split("[$]"); // this will only work with the regex 
    
    // split function takes in the regex 
    // [] brackets represent a character - which in here is the . 
    // Need to learn regular expression 
    
    System.out.println(pds.length);

    for(String p : pds)
    {
      System.out.println(p);
    }
  }
}

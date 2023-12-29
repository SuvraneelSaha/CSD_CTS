package JavaTraining.Day3;

public class O7 {
  public static void main(String[] args) {
    // substring function 

    String cohortCode = "CSDCIS24CS007";

    // CSDFSD24JS001;

    // to find the next cohort code we need to split the string 
    

    System.out.println(cohortCode.substring(0, 6));

    String str = cohortCode.substring(0, 6);

    System.out.println(cohortCode.substring(6, 8));

    // single index for substring and 
    // two arguments for starting index and end position 

    String str2 = cohortCode.substring(6, 8) ; 

    System.out.println(cohortCode.substring(8, 10));

    String str3 = cohortCode.substring(8, 10);
  
    System.out.println(cohortCode.substring(10));

    String str4 = cohortCode.substring(10);
    System.out.println(str4);
    

  }
  
}

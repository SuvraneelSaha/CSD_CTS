package JavaTraining.Day3;

public class O11 {
  public static void main(String[] args) {
    int n = 10 ; 
    String s = String.valueOf(n);

    System.out.println(s);

    char c ='a' ; 

    s= String.valueOf(c);

    System.out.println(s);

    boolean b= true;

    s=String.valueOf(b);

    System.out.println(s);
    // To convert String to primtive 

    String snigga = "10" ; 

    
    int a = Integer.parseInt(snigga);
    
    System.out.println(a);

    snigga = "12.3" ;

    float f = Float.parseFloat(snigga);

    System.out.println(f);


  }
}

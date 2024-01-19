package JavaTraining.TechStac;
import java.util.*;
public class O4 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Inmate's name:");
    String str = in.nextLine();

    System.out.println("Inmate's father's name:");
    String fatherName = in.nextLine();

    String ans = str+" "+fatherName;

    ans = ans.toUpperCase();

    String check = ans.replaceAll("[a-zA-Z ]+", "");

    if(check.length()==0) 
    {
      System.out.println(ans);
    }
    else
    {
      System.out.println("Invalid Name");
    }


    
    
    

  }
  
}
/*
 * if(!((alphabet>=65 && alphabet<=90) || (alphabet>=97 && alphabet<=122) || (alphabet==32)))
      {
        return false;
      }
    }
    return true;
 */

 /*
  * public static boolean isValid(String str)
  {
    for (int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      
      int alphabet = (int)ch;

      if(ch==32)
      {
        continue;
      }
      if(!Character.isAlphabetic(ch) )
      {
        return false;
      }

  }
  return true ; 

}
  */
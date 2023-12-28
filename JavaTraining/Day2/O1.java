package JavaTraining.Day2;

public class O1 {
  public static void main(String[] args) {
    // javatpoint
    // Java Program to count the total number of characters in a string only the characters 



    String str = "Java FSE Developer" ; 

    System.out.println(str.length());

    System.out.println("without spaces "+countCharacters(str));


    
  }

  public static int countCharacters(String str)
  {
    int count = 0 ; 
    for(int i = 0 ; i < str.length();i++)
    {
      char ch = str.charAt(i);

      if(ch!=' '){
        count++;
      }
    }

    return count;
  }
  
}

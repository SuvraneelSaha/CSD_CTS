package JavaTraining.Week3.Day1;

public class O2 {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Welcome");
    
    sb.append(" To Java");

    // stringbuffer vs stringbuilder 
    // in case of stringbuffer it is thread safe 
    // and in case of stringbuilder it is not thread safe 

    String str = new String("Welcome");
    str.concat(" To Java");

    // stringbuffer does not allows multi threaded actions 

    // in case of stringbuilder allows more than one thread 

    

  }
}

package JavaTraining.Day3;

public class O3 {
  public static void main(String[] args) {
    String statement="Welcome to Java";
    String words[]=statement.split(" ");
    System.out.println(words.length);
    for(String word:words) {
      System.out.println(word);
    }
  }
}

package JavaTraining.Day2_JavaTrainingSession;

public class O10 {
  public static void main(String[] args) {
      /*
         * 1. String by literal   
         */
		String str1="welcome";
		String str2="welcome";
		System.out.println(str1==str2);
		/*String by reference*/
		String str11=new String("welcome");
		String str22=new String("welcome");
         System.out.println(str11==str22);
         System.out.println(str11.equals(str22));
  }
}

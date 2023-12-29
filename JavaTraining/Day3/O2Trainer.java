package JavaTraining.Day3;

public class O2Trainer {
  public static void main(String[] args) {
    String str="welcome";
    char c='p';
   System.out.println(str.indexOf(c)>=0?
       (str.indexOf(c)==str.lastIndexOf(c)?"Not Repeated":"Yes Repeated"):"No");
}
}

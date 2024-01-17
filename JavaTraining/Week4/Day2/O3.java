import java.util.*;

public class O3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the objects :");
    int n = Integer.parseInt(in.nextLine());

    Map<Integer,String> idDes = new HashMap<Integer,String>();

    Map<Integer,Integer> idSal = new HashMap<Integer,Integer>();

    for(int i = 0 ; i < n ; i++)
    {
      System.out.println("enter the ID ");
      int id = Integer.parseInt(in.nextLine());
      System.out.println("");
    }
  }
}

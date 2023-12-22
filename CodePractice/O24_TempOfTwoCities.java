import java.util.*;

public class O24_TempOfTwoCities {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter How Many Cities");
    int n = in.nextInt();

    System.out.println("Please enter the Number of days : ");
    int m = in.nextInt();

    int[][] arr = new int[n][m];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j] = in.nextInt();

      }
    }

    // Printing the temp of all the days 

    for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }


    for (int i = 0; i < arr.length; i++) {
      int sum = 0 ;
      for (int j = 0; j < arr.length; j++) {
        sum = sum + arr[j][i];
      }
      System.out.println("Sum of Column is "+sum);
      System.out.println("AVG of Column is "+sum/m);

    }


  }
}

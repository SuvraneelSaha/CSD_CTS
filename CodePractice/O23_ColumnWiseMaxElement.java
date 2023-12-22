import java.util.*;

public class O23_ColumnWiseMaxElement{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter the size of the rows : ");
    int n = in.nextInt();
    System.out.println("Please enter the size of the columns : ");
    int m = in.nextInt();

    int[][] arr = new int[n][m];

    // column wise max element 

    // input 
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = in.nextInt();
      }      
    }

    in.close();

    for(int i = 0 ; i < arr.length;i++)
    {
      int max = 0 ; 
      for(int j = 0 ; j < arr[i].length;j++)
      {
        if( arr[j][i] > max )
        {
            max = arr[i][j];
        }
      }
      System.out.print(max + " ");
    }


  }
}
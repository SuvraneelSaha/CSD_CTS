import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class O2 {
  public static void main(String[] args) {
   	Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of objects ");
    int n = Integer.parseInt(in.nextLine());

    TreeMap<Integer,String> list = new TreeMap<Integer,String>();
    for(int i = 0 ; i<n;i++)
    {
        System.out.println("Enter the Id");
        int id = Integer.parseInt(in.nextLine());
        System.out.println("Enter the name");
        String name = in.nextLine();
        list.put(id,name);
        
    }
    
    
    
    System.out.println(list);
    
    String ans = getMaxKeyValue(list);
    
    System.out.println(ans);

    
  }
  public static String getMaxKeyValue(TreeMap<Integer,String> list)
    {
	    int n = list.lastKey();
	    
	    String ans;
	    ans = list.get(n);
	    
	    return ans ; 
	}
}

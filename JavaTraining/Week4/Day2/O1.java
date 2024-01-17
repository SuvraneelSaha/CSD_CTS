import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class O1 {
  public static void main(String[] args) {
    // Removing elements from HashMap

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the Number of Objects to be Put into a HashMap");
    int n = Integer.parseInt(in.nextLine());

    Map<Integer,String> list = new ConcurrentHashMap<Integer,String>();
    // normal Hashmap // no linkedHashMap , no treeHashMap just 
    // simple hashmap 

    for (int i = 0; i < n; i++) {
      System.out.println("Enter the Id");
      int id = Integer.parseInt(in.nextLine());
      System.out.println("Enter the Name");
      String name = in.nextLine();

      list.put(id, name);

    }

    System.out.println(list);

    System.out.println(afterDelete(list));

  }
  public static int afterDelete(Map<Integer,String> list)
  {
    int count = 0 ; 
   for(Map.Entry<Integer,String> e : list.entrySet())
   {
    if(e.getKey() % 3 ==0)
    {
      list.remove(e.getKey());
      count++;
    }
   }

   return count;
  }
}

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
    // HashMap comes under Map 
    // here we have used just Map and the type of the Map is ConcurrentHashMap
    // as there is deletion simultaneous operations 
    // Stackoverflow just 

    for (int i = 0; i < n; i++) {
      System.out.println("Enter the Id");
      int id = Integer.parseInt(in.nextLine());
      System.out.println("Enter the Name");
      String name = in.nextLine();

      list.put(id, name);

    }

    System.out.println(list);

    System.out.println(afterDelete(list));
    in.close();

    System.out.println("size of the list is "+list.size());
    System.out.println(list.toString());

  }
  public static int afterDelete(Map<Integer,String> list)
  {
    int count = 0 ; 
   for(Map.Entry<Integer,String> e : list.entrySet())
   {
    int key = e.getKey();
    if(key % 3 ==0)
    {
      list.remove(key);
      count++;
    }
   }

   return count;
  }
}

public class O2{
 
public static void main(String[] args) {
 
		List<Integer> lst=new ArrayList<Integer>();

		lst.add(12);

		lst.add(23);

		lst.add(45);

		//List<Integer> oddList=new ArrayList<Integer>();

		lst.forEach(n->System.out.println(n));

		List<Integer> oddList=lst.stream()

		    .filter(n->n%2!=0)

		    .collect(Collectors.toList());

		oddList.forEach(n->System.out.println(n));


 
	}

 
}
	/*
	 * Given input is one array remove number 10 from the given array
	 * Sample Input
	 * 5 
	 * 
	 * 1
	 * 10
	 * 45
	 * 10
	 * 20
	 * 
	 * sample output
	 * 1
	 * 45
	 * 20
	 */
public class O3
{
  public static void main(String[] args )
  {
    int a[]= {1,10,45,10,20};
		a=Usermaincode.removeTens(a);
		for(int value:a) {
			System.out.println(value);
		}
  }
}

public class Usermaincode {


  public static int[] removeTens(int[] a) {
		//1,10,45,10,20
		int[] ans=null;
		ArrayList<Integer> lst=new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if(a[i]==10) {
				continue;
			}else {
				lst.add(a[i]);
			}
		}
		ans=new int[lst.size()];
		int index=0;
		for(int value:lst) {
			ans[index++]=value;
		}
		return ans;
	}


 
}
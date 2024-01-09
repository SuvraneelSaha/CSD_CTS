package JavaTraining.Week3.Day2;

import java.util.ArrayList;

public class UsermainCode {
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

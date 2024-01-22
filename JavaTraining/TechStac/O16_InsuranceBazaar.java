public class O16_InsuranceBazaar
{
  public static void main(String[] args)
  {

  }
}
package com.ui;
import com.utility.*;
import java.util.*;
import java.util.Map.*;

 class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		//Fill the UI code
		
		System.out.println("Enter the no of Policy names you want to store");
        
        int n = Integer.parseInt(in.nextLine());
        
        Bazaar obj = new Bazaar();
        
        obj.setPolicyMap(new TreeMap<>());

        
        for(int i = 0 ; i < n ;i++)
        {
            System.out.println("Enter the Policy ID");
            
            int policyId = Integer.parseInt(in.nextLine());
            
            System.out.println("Enter the Policy Name");
            
            String policyName = in.nextLine();
            
            obj.addPolicyDetails(policyId,policyName);
            
        }
        
        Map<Integer,String> hmm = obj.getPolicyMap();
        
        for(Entry<Integer,String> e : hmm.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        
        System.out.println("Enter the policy type to be searched");
        
        String search = in.nextLine();
        
        List<Integer> list = obj.searchBasedOnPolicyType(search);
        
        for(int e : list)
        {
            System.out.println(e);
        }
        
       
	}

}


package com.utility;
import com.ui.*;
import java.util.*;

// public keyword
 class Bazaar {
	
	private Map<Integer,String> policyMap;
	
	public Map<Integer, String> getPolicyMap() {
		return policyMap;
	}

	public void setPolicyMap(Map<Integer, String> policyMap) {
		this.policyMap = policyMap;
	}

	//This method should add the policyID as key and policyName as value into the policyMap
	public void addPolicyDetails(int policyId,String policyName)
	{
		policyMap.put(policyId,policyName);
	}
	
	/*
	 * This method should search the policy name based on the policy type and add those policy names
	 * into the list and return the list.
	 * For example: If the map contains the key and value as:
	 *  10654 Max Bupa Health Insurance
	    10321 SBI Health Insurance
	    20145 IFFCO Tokio Two Wheeler Insurance
	    20165 New India Assurance Two Wheeler Insurance
	    10110 Reliance Health Insurance
		if the policy type is Health the output should be
		10110
		10321
		10654

	 */
	public List<Integer> searchBasedOnPolicyType(String policyType){
	    
		 List<Integer> li = new ArrayList<Integer>();
		 
		 for(Map.Entry<Integer,String> e : policyMap.entrySet())
		 {
		    int key = e.getKey();
		     
		     String value = e.getValue();
		     
		     if(value.contains(policyType))
		     {
		         li.add(key);
		     }
		 }
		return li;
	}
	

}

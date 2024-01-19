import java.util.*;
public class O8{
  static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
       AccountDetails obj1 = new AccountDetails();
		
		Account obj = new Account();
		
		obj = obj1.getAccountDetails();
		
		int withdraw = obj1.getWithdrawAmount();
	
	    obj.withdraw(withdraw);
    }
    public Account getAccountDetails()
    {
        
        // Scanner in = new Scanner(System.in);
	    
	    Account obj = new Account();
	    
	    System.out.println("Enter account id:");
		int accountId = Integer.parseInt(in.nextLine());
		
		System.out.println("Enter account type:");
		String accountType = in.nextLine();
		
		System.out.println("Enter balance:");
		int balance;
		while(true)
		{
		    balance = Integer.parseInt(in.nextLine());
		    
		    if(balance<=0)
		    {
		      System.out.println("Balance should be positive");  
		    }
		    else
		    {
		        break;
		    }
		}
		
		// PUTTING THE VALUES INTO THE OBJECT 
		
		obj.setAccountId(accountId);
		obj.setAccountType(accountType);
		obj.setBalance(balance);
		
		return obj;
	}
  public int getWithdrawAmount() 
	{
	   // Scanner in = new Scanner(System.in);
	   
	   
	    System.out.println("Enter amount to be withdrawn:");
	    int withdraw;
	    while(true)
	    {
	        withdraw = Integer.parseInt(in.nextLine());
	    
	        if(withdraw<=0)
	        {
	        System.out.println("Amount should be positive");
	        }
	        else
	        {
	            break;
	        }
	    }
	    return withdraw;
	    
	}
}
class Account{
   private int accountId;
    private String accountType; 
    private int balance;
    
    // SETTER FUNCTIONS 
    
    public void setAccountId(int accountId)
    {
        this.accountId = accountId;
    }
    
    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }
    
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    
    // GETTER FUNCTIONS 
    
    public int getAccountId()
    {
        return this.accountId;
    }
    
    public String getAccountType()
    {
        return this.accountType;
    }
    
    public int getBalance()
    {
        return this.balance;
    }
    
    // FUNCTION 
    public boolean withdraw(int withdraw)
    {
        int ans = 0 ;
        if(this.balance>withdraw)
        {
            ans = this.balance - withdraw;
            System.out.println("Balance amount after withdraw:"+ans);
            return true;
        }
        else
        {
            System.out.println("Sorry!!! No enough balance");
            
        }
        return false ; 
    }
    
}
public class O12_AccountManipulationAbstractclass{
  public static void main(String[] args)
  {
    
  }
}

// removed all the public keywords 
 class SavingsAccount extends Account 
{

    // INSTANCE VARIABLES 
    
     private double minimumBalance;

    //Uncomment the getters and setters after writing the attributes

    
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
    
    public SavingsAccount(int accountNumber ,Customer customerObj,double balance,double minimumBalance)
    {
        super(accountNumber,customerObj,balance);
        
        this.minimumBalance = minimumBalance;
    }
    
     public boolean withdraw(double amount) {
         
         if(balance-amount > minimumBalance)
         {
             balance = balance-amount;
             return true;
         }
         
         return false ; 
     }

}
abstract  class Account {
    // INSTANCE VARIABLES 
   protected int accountNumber;

   protected Customer customerObj;

   protected double balance;
    
    //Uncomment the getters and setters after writing the attributes
    
    
    public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCustomerObj() {
		return customerObj;
	}

	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// CONSTRUCTOR 
	public Account(int accountNumber ,Customer customerObj ,double balance)
	{
	    this.accountNumber=accountNumber;

        this.customerObj=customerObj;

        this.balance=balance;
	}
	    
	
    
    abstract public boolean withdraw(double amount);
    
    
}   


 class Customer {
	
	
	//Attributes
	private int  customerId;
	private String customerName;
	private String emailId;
	
	//Constructor
	public Customer(int customerId, String customerName, String emailId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.emailId = emailId;
	}

    //Getters and Setters
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

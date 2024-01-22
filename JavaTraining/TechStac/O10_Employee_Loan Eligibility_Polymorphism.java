public class O10
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);

     // removed public from all the below classes 
  }
}

 class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		double LoanAmount = 0.0;
		if(employeeObj instanceof TemporaryEmployee)
		{
		    LoanAmount = (employeeObj.getSalary() * 10)/100;
		    
		}
		
		if(employeeObj instanceof PermanentEmployee)
		{
		    LoanAmount = (employeeObj.getSalary() * 15)/100;
		}
		return LoanAmount;
	}

}

//Make this class inherit the Employee class

 class TemporaryEmployee extends Employee {
	
	private int  hoursWorked;
	private int hourlyWages;
	
	// Getters and Setters
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	//1. Write a public 4 argument constructor with arguments – employeeId, employeeName, hoursWorked and hourlyWages.  
	public TemporaryEmployee(int employeeId,String employeeName,int hoursWorked,int hourlyWages)
	{
	    super(employeeId,employeeName);
	    
	    
	    this.hoursWorked=hoursWorked;
	    this.hourlyWages=hourlyWages;
	}
	
	
	
	//2. Implement the  - public void calculateSalary() - method  
	public void calculateSalary()
	{
	    salary = hoursWorked * hourlyWages;
	}
	
	
}

//Make this class inherit the Employee class

 class PermanentEmployee extends Employee
{
    private double basicPay;
    
    // Getters and Setters
	
    public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
    
    //1. Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.  
    public PermanentEmployee(int employeeId,String employeeName,double basicPay)
    {
        super(employeeId,employeeName);
        
        this.basicPay=basicPay;
    }
    
	
	//2. Implement the  - public void calculateSalary() - method   
    
    public void calculateSalary(){
        double PfAmount ; 
        PfAmount = basicPay * 0.12;
        double amount =  basicPay - PfAmount;
        salary = amount;
    }
    
}

abstract  class Employee
{
	protected int employeeId;
    protected String employeeName;
    protected double salary;
    
    //Getters and Setters
  	public int getEmployeeId() {
  		return employeeId;
  	}
  	public void setEmployeeId(int employeeId) {
  		this.employeeId = employeeId;
  	}
  	public String getEmployeeName() {
  		return employeeName;
  	}
  	public void setEmployeeName(String employeeName) {
  		this.employeeName = employeeName;
  	}
  	public double getSalary() {
  		return salary;
  	}
  	public void setSalary(double salary) {
  		this.salary = salary;
  	}
  	
  	
    //Write a public 2 argument constructor with arguments – employeeId,and employeeName
    public Employee(int employeeId,String employeeName)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    
    
    
     
    //Write a method -  public void calculateSalary()
	//Make this method as abstract
	  public abstract void calculateSalary();
}
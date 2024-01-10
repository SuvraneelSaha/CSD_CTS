package JavaTraining.Week3.Day1;


public class O7{
  public static void main(String[] args) {
    
  }
}





public class LocationWiseManager extends Manager{
	private String locationName;
 
	public LocationWiseManager(int eno, String ename, Float salary, int noOfEmployees) {
		super(eno, ename, salary, noOfEmployees);
		// TODO Auto-generated constructor stub
	}
 
	public String getLocationName() {
		return locationName;
	}
 
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
 
	


 
}
 
public class Manager extends Employee{
	private int noOfEmployees;
 
	public Manager(int eno, String ename, Float salary, int noOfEmployees) {
		super(eno, ename, salary);//where super is keyword which refer  base class object
		this.noOfEmployees = noOfEmployees;
	}
 
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
 
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

 
 
}
/*
* POJO
* VO
* TO
*/
public class Employee {
	private int eno;
	private String ename;
	private Float salary;
//	public Employee() {
//		super();
//	}
 
	public Employee(int eno, String ename, Float salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
 
	public int getEno() {
		return eno;
	}
 
	public void setEno(int eno) {
		this.eno = eno;
	}
 
	public String getEname() {
		return ename;
	}
 
	public void setEname(String ename) {
		this.ename = ename;
	}
 
	public Float getSalary() {
		return salary;
	}
 
	public void setSalary(Float salary) {
		this.salary = salary;
	}

 
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	// Keep in mind that in case of instance variables in the main class
	// we need to define the type of the instance variables speciallly in the 
	// case of collections 
	private static Map <String,Double> employeeMap=new HashMap<String,Double>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
	    // this list will be returned from the lamda function 
	    // 
		ArrayList<String> name= new ArrayList<String>();
		
		// Fill the code
		// this obj of type EmployeeAudit will be returned from the findEmployee() function 
		
		
		// and the ArrayList name which is in itself a type of  arraylist will be 
		// returned from the lamda function
		EmployeeAudit obj = (salary) ->
		{
		    for(String s : employeeMap.keySet())
		    {
		        if(employeeMap.get(s) <= salary)
		        {
		            name.add(s);
		        }
		        else
		        {
		            
		        }
		    }
		    return name;
		};
		return obj;
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		
		// Fill the code
		
		// Creating the Object of the Main class 
		// cause without creating the object we cannot access the functions 
		// and the instance variables that are present inside of it 
		
		Main mobj = new Main();
		
		while(true)
		{
		    System.out.println("1.Add Employee Details");
		    System.out.println("2.Find Employee Details");
		    System.out.println("3.Exit");
		    System.out.println("Enter the choice");
		    int c = Integer.parseInt(in.nextLine());
		    
		    if(c==3)
		    {
		        System.out.println("Let's complete the session");
		        break;
		    }
		    else if(c==1)
		    {
		        System.out.println("Enter the Employee name");
		        
		        String employeeName = in.nextLine();
		        
		        System.out.println("Enter the Employee Salary");
		        
		        double salary = Double.parseDouble(in.nextLine());
		        
		        mobj.addEmployeeDetails(employeeName,salary);
		        
		    }
		    else if(c==2)
		    {
		        System.out.println("Enter the salary to be searched");
		        double salary = Double.parseDouble(in.nextLine());
		        
		        ArrayList<String> list = findEmployee().fetchEmployeeDetails(salary);
		        
		        if(list.size()==0)
		        {
		              System.out.println("No Employee Found");
		        }
		        else
		        {
		            for(int i = 0 ; i< list.size();i++)
		            {
		                System.out.println(list.get(i));
		            }
		        }
		        
		    }
		}
	}

}

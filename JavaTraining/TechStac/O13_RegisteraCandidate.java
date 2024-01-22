public class O13_RegisteraCandidate
{
   // static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        try{
        Candidate obj = getCandidateDetails();
        System.out.println("Registration Successful");
            
        }
        
        catch(InvalidSalaryException eo){
            System.out.println(eo.getMessage());
        }
    }
     public static Candidate getCandidateDetails() throws InvalidSalaryException
     {
         Scanner in = new Scanner(System.in);
         Candidate obj = new Candidate();
         
         System.out.println("Enter the candidate Details");
         
         System.out.println("Name");
         
         String name = in.nextLine();
         
         
         
         System.out.println("Gender");
        
         String gender = in.nextLine();
        
         
         
         System.out.println("Expected Salary");
         
         double expectedSalary = in.nextDouble();
         
         if(expectedSalary < 10000)
         {
             throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
         
            //  return null;
         }
         else
         {
            obj.setName(name);
            
            obj.setGender(gender);
             
            obj.setExpectedSalary(expectedSalary);
             
         }
         
         
         return obj;
         
         
     }
}

//public
 class InvalidSalaryException extends Exception{
    
    public InvalidSalaryException(String str)
    {
        super(str);
    }
}

// public 
import java.util.*;
 class Candidate {
	
	// INSTANCE VARIABLES 
	private String name;
	private String gender;
	private double expectedSalary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
}

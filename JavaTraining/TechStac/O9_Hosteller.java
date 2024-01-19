import java.util.*;
public class O9{
  static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
         System.out.println("The Student Details");
	    getHostellerDetails();
    }
}
 class Hosteller extends Student
{
    // Instance Variables 
    private String hostelName;
    private int roomNumber;

    // SETTER FUNCTIONS
    public void setHostelName(String hostelName)
    {
        this.hostelName = hostelName;
    }
    
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }
    
    // GETTER FUNCTIONS 
    
    public String getHostelName()
    {
        return this.hostelName;
    }
    
    public int getRoomNumber()
    {
        return this.roomNumber;
    }
}


 class Student
{
    
// Instance Variables 

protected int studentId;
protected String name;
protected int departmentId;
protected String gender;
protected String phone;

// SETTER FUNCTIONS 
public void setStudentId(int studentId)
{
    this.studentId = studentId;
}

public void setName(String name)
{
    this.name = name;
}

public void setDepartmentId(int departmentId)
{
    this.departmentId = departmentId;
}

public void setGender(String gender)
{
    this.gender = gender;
}

 
 public void setPhone(String phone)
 {
     this.phone = phone;
 }
 
 // GETTER FUNCTIONS
 public int getStudentId()
{
    return this.studentId;
}

public String getName()
{
    return this.name;
}

public int getDepartmentId()
{
     return this.departmentId;
}

public String getGender()
{
    return  this.gender;
}

 
 public String getPhone()
 {
     return this.phone;
 }
 
 
}

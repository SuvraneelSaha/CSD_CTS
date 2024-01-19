package JavaTraining.TechStac;

import java.util.Scanner;

public class O7_StudentDetailsConstructor {
  public static void main(String[] args) {

     Scanner in = new Scanner(System.in);

    System.out.println("Enter Student's Id:");
    int studentId = Integer.parseInt(in.nextLine());

    System.out.println("Enter Student's Name:");
    String studentName = in.nextLine();

    System.out.println("Enter Student's address:");
    String  studentAddress = in.nextLine();

    while (true) {

      System.out.println("Whether the student is from NIT(Yes/No):");
      String input = in.nextLine();

      if(input.equals("YES") || input.equals("yes"))
      {
        //NIT constructor 
        // 3 argument constructor
        Student obj = new Student(studentId, studentName, studentAddress);

        System.out.println("Student id:"+obj.getStudentId());
        System.out.println("Student name:"+obj.getStudentName());
        System.out.println("Address:"+obj.getStudentAddress());
        System.out.println("College name:"+obj.getCollegeName());
        break;
      }
      else if(input.equals("no")||input.equals("NO"))
      {
        // Other College Constructor
        // 4 constructor constructor
        System.out.println("Enter the college name:");

        String collegeName = in.nextLine();

        Student obj = new Student(studentId, studentName, studentAddress,collegeName);

        System.out.println("Student id:"+obj.getStudentId());
        System.out.println("Student name:"+obj.getStudentName());
        System.out.println("Address:"+obj.getStudentAddress());
        System.out.println("College name:"+collegeName);
        break;
      }
      else
      {

      }

    }

    }

  }

class Student{

// Instance Variables 
// Instance Variables 
private int studentId;
private String studentName;
private String  studentAddress;
private String collegeName;


// constructors 

// CONSTRUCTOR FOR 4 NON NIIT

public Student(int studentId,String studentName,String studentAddress,String collegeName)
{  
  this.studentId = studentId;
  this.studentName = studentName;
  this.studentAddress = studentAddress;
  this.collegeName = collegeName;
}  

// CONSTRUCTOR FOR NIIT 
public Student(int studentId,String studentName,String studentAddress)
{  
  this.studentId = studentId;
  this.studentName = studentName;
  this.studentAddress = studentAddress;
  this.collegeName="NIT";
  
}  



// GETTER FUNCTIONS

public int getStudentId()
{
  return this.studentId;
}

public String getStudentName()
{
  return this.studentName;
}

public String getStudentAddress()
{
  return this.studentAddress;
}

public String getCollegeName()
{
  return this.collegeName;

}




}
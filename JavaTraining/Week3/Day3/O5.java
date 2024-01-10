package JavaTraining.Week3.Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class O5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    StudentBo sbo = new StudentBo();
    System.out.println("Enter the number of objects The user want to enter :");
    int n = in.nextInt();
    
    
      // System.out.println("Enter the student id number : ");
      // int id = Integer.parseInt(in.nextLine());
      // System.out.println("Enter the name of the Student :");
      // String name = in.nextLine();
      // Student student = new Student(id,name);
      // sbo.addStudent(student);
      
			Student student=new Student(1,"a");
		sbo.addStudent(student);
		System.out.println(sbo.getAll());
    
    // System.out.println(sbo.getAll());
  }
}
class Student{
  private int eno;
	private String ename;

	public Student(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
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

  @Override
	public String toString() {
		return "Student [eno=" + eno + ", ename=" + ename + "]";
	}

} 


class StudentBo
{
 ArrayList<Student> studentList = new ArrayList<Student>();

public void addStudent(Student student)
{
  studentList.add(student);

}

public ArrayList<Student> getAll()
  {
    return studentList;
  }
}
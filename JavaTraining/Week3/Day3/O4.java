package JavaTraining.Week3.Day3;

import java.util.Scanner;

public class O4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Student[] students = new Student[5];

    for (int i = 0; i < students.length; i++) 
    {
      System.out.println("Enter the Student ID ");
      int id = in.nextInt();  
      in.nextLine();
      System.out.println("Enter the name of the Student");
      String name = in.nextLine();
      students[i] = new  Student(id,name);
    }


    System.out.println("output");

    for(Student i : students)
    {
      System.out.println(i.getEno());
      System.out.println(i.getEname());
    }
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
} 

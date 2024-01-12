package JavaTraining.Week3.Day5;

import java.util.*;


public class O7 {
  public static void main(String[] args) {
    StudentBo operation = new StudentBo();

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for(int i = 0 ; i<n;i++)
    {
      String name = in.nextLine();
      in.nextLine();
      int marks = in.nextInt();

      Student s1 = new Student(name, marks);

      operation.addStudent(s1);

    }

    Collections.sort(operation.getAll(),new NameComparator());

    System.out.println(operation);
  }
}


class StudentBo{
 private ArrayList<Student> list = new ArrayList<Student>();

  public void addStudent(Student s)
  {
    list.add(s);
  }

  public ArrayList<Student> getAll()
  {
    return list ; 
  }
}

class Student implements Comparable<Student>{
  private int no;

  private String name; 

  public Student(String name,int no)
  {
    //super();
    this.no = no;
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name ; 
  }

   public int getNo()
  {
    return no;
  }

@Override
public String toString()
{
  return "Student [no. = "+no + " ,name = "+name+"]" ; 

}

@Override
public int compareTo(Student s1)
{
  // System.out.println(this);

  return this.no<s1.getNo()?(this.no==s1.getNo()?0:-1):1;
  // s1 is the next object 
  // and this is for the current object 
  // depending upon the number whether it is positive 0 or negative , it will sort 

  // return this.name.compareTo(s1.getName());
  // for sorting according to the name of the object's name 

  


  // return this.no<s1.getNo()?0:1 ; 
}
}

class NumberComparator implements Comparator<Student>
{

  @Override
  public int compare(Student s1,Student s2)
  {
    return s1.getNo()-s2.getNo();
  }
}

class NameComparator implements Comparator<Student>{
  @Override
	public int compare(Student s1, Student s2) {
	
		return s2.getName().compareToIgnoreCase(s1.getName());
	}
}
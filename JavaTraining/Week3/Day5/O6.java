package JavaTraining.Week3.Day5;

import java.util.*;

public class O6 {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<Student>();

    list.add(new Student(123, "za"));
    list.add(new Student(37, "b"));
    list.add(new Student(30, "cd"));

    Collections.sort(list, new NumberComparator());

    System.out.println(list);
    
  }
}

class NameComparator implements Comparator<Student>{
  @Override
	public int compare(Student s1, Student s2) {
	
		return s2.getName().compareToIgnoreCase(s1.getName());
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

class Student implements Comparable<Student>{
  private int no;

  private String name; 

  public Student(int no,String name)
  {
    super();
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

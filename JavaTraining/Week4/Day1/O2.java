package JavaTraining.Week4.Day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class O2 {
  public static void main(String[] args) {
    Set<Student> uniq=new LinkedHashSet<Student>();
		uniq.add(new Student(1,"mn"));
		uniq.add(new Student(2,"abc"));
		uniq.add(new Student(2,"abc"));
		Student s1=new Student(3,"lk");
		uniq.add(s1);
		uniq.add(s1);
		System.out.println(uniq);
  }
}
 class Student {
	private int no;
	private String name;
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		Student firstObject=(Student)obj;
		return firstObject.getNo()==this.no && firstObject.getName().equals(this.name);
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
//	@Override
//	public int compareTo(Student s1) {
//		//System.out.println(this);
//		//return this.no<s1.getNo()?(this.no==s1.getNo()?0:-1):1;
//		//return this.no-s1.getNo();
//		return s1.getNo()-this.no;
//		
//
//	
//}
}
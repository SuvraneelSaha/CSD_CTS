import java.util.Scanner;
import java.util.stream.Stream;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		//Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String rollNumbers = in.nextLine();
		
// 		System.out.println(rollNumbers);
		
		System.out.println("Enter the department name acronym");
		
		String dept = in.nextLine();
		
// 		System.out.println(dept);

		Stream<String> strStream = getRollNumbers(rollNumbers);
		
		int count = getCount(strStream,dept);
		
		if(count==0)
		{
		    System.out.println("No students from "+dept);
		}
		else
		{
		    System.out.println("Number of students in "+dept+" is "+count);
		}
		


	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
		
		String[] strArr = rollNumbers.split(",");
		
		ArrayList<String> li = new ArrayList<>();
		
		for(String s : strArr)
		{
		    li.add(s);
		}
		
		
    return li.stream();

	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here

        int count = 0 ;
        count = (int) rollNumberStream.filter(n-> n.toLowerCase().startsWith(dept.toLowerCase())).count();
        
        return count ; 

	}

}

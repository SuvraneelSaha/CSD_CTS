import java.util.stream.Stream;
import java.util.*;
import java.util.List; 
import java.util.stream.Collectors; 
import java.util.stream.Stream; 

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

        Employee[] empObj = new Employee[details.length]; 
        
		//Fill your code here
        for(int i = 0 ; i < details.length;i++)
        {
            Employee obj = new Employee();
            
            String str = details[i];
            
            String[] strArr = str.split(";");
            
            obj.setEmpId(strArr[0]);
            obj.setEmpName(strArr[1]);
            obj.setSalary(Double.parseDouble(strArr[2]));
            
            empObj[i] = obj;
        }
        return empObj;
	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
        Stream<Employee> empstream = Arrays.stream(empDetails);
        
        return empstream;

	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {
	    
	    
	    List<String> arr=new ArrayList<>();
        empStream.filter(s->s.getSalary()>=minSalary)
        .forEach(i->
        {
            String op="";
            op+=i.getEmpId()+" "+i.getEmpName()+" "+i.getSalary();
            arr.add(op);
        });
        String sht[]=new String[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            sht[i]=arr.get(i);
        }
        Arrays.sort(sht);
        return sht;
	

		//Fill your code here
// 		List<String> li = new ArrayList<String>();
		
// 		empStream.filter(s-> s.getSalary() > minSalary).
// 		forEach(i -> 
// 		{
// 		    String out ="";
// 		    out += i.getEmpId() +" "+i.getEmpName()+" "+i.getSalary();
// 		    li.add(out);
// 		});
		
// 		String[] strAns = new String[li.size()];
		
// 		for(int i = 0 ; i < li.size();i++)
// 		{
// 		    strAns[i] = li.get(i);
// 		}
		
// 		Arrays.sort(strAns);
		
// 		return strAns;
	}

}

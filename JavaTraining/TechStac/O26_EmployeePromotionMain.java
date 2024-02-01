import java.util.*;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//fill the code
		System.out.println("Enter the number of employees");
        int n=Integer.parseInt(sc.nextLine());
        String str[]=new String[n];
        List<Employee> list=new ArrayList<>();
        System.out.println("Enter the employee details");
        for(int i=0;i<n;i++)
        {
            str[i]=sc.nextLine();
            String s[]=str[i].split(":");
            Employee ob=new Employee(s[0],s[1],Double.parseDouble(s[2]));
            list.add(ob);
        }
        System.out.println("Enter the number of times salary limit to be searched");
        int limit=Integer.parseInt(sc.nextLine());
        String count[]=new String[limit];
        for(int i=0;i<limit;i++)
        {
            System.out.println("Enter the salary limit to be searched");
            double slimit=sc.nextDouble();
            Management b=new Management(slimit,list);
            b.run();
            int c=b.getCount();
            DecimalFormat df=new DecimalFormat("#.0");
            String d=df.format(slimit);
            count[i]=d+":"+String.valueOf(c);
        }
        for(int i=0;i<count.length;i++)
        {
            System.out.println(count[i]);
        }
    }
}
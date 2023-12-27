package JavaTraining.Day1;

 import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		/*
		 * 1. Main class
		 * 2. System.in
		 * 3. Optimized program(ternary,proper variable name)
		 *  4. Debugging 
		 */
//		int n1,n2,n3;
//		Scanner input=new Scanner(System.in);
//		n1=input.nextInt();
//		n2=input.nextInt();
//		n3=input.nextInt();
//		
//		System.out.println(n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3));
		/*
		 * 2 7 3 8 4 9
		 */
		int no=2;
		for (int term = 1; term<=3; term++,no++) {
			System.out.print(no+"\t"+(no+5)+"\t");
		}

		int f=2,s=7;
		for (int term = 1; term<=3; term++,f++,s++) {
			System.out.print(f+"\t"+s+"\t");
		}

	}
 
} 

 package JavaTraining.Day2_JavaTrainingSession;

import java.util.Scanner;

public class O6_Array {
public static void main(String[] args) 
{
  /*
		 * Array is a basic data structure in which we can store same type of elements
		 * in an contigious memory location
		 * 
		 */
		int a[] = { 1, 2, 3 };
		System.out.println(a.length);
 
		int aa[] = new int[3];
		aa[0] = 1;
		aa[1] = 2;
 
		int aaa[];
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		aaa = new int[size];
 
		for (int i = 0; i < aaa.length; i++) {
			aaa[i] = input.nextInt();
		}
		for (int value:aaa) {
			System.out.println(value);
		}
  }
}
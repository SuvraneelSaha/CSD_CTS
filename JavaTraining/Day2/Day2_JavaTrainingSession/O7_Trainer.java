package JavaTraining.Day2.Day2_JavaTrainingSession;

import java.util.Scanner;

public class O7_Trainer {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
		System.out.println("Enter number of elelement");
		int size=input.nextInt();
		int values[]=new int[size];
		System.out.println(" Enter the elements");
		for (int i = 0; i < size; i++) {
			values[i]=input.nextInt();
		}
		System.out.println("enter the element to be searched");
		int searchElement=input.nextInt();
		boolean isPresent=false;
		int position=0;
		for (int i = 0; i < values.length; i++) {
			if(values[i]==searchElement) {
				isPresent=true;
				position=i+1;
			}
		}
		System.out.println(isPresent?
				searchElement+" at "+position:"Not Present");
  }
}

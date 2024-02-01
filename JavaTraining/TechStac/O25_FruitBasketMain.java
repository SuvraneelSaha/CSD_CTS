import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option=0;
		String fruitName="";
		int weightInKgs=0;
		int pricePerKg=0;
		FruitBasketUtility utilObj=new FruitBasketUtility();
		do {
			System.out.println("Select an option:\n1.Add Fruit to Basket\n2.Calculate Bill\n3.Exit");
			option=sc.nextInt();
			sc.nextLine();
			switch (option)
			{
			case 1:
				System.out.println("Enter the fruit name");
				fruitName=sc.nextLine();
				System.out.println("Enter weight in Kgs");
				weightInKgs=sc.nextInt();
				System.out.println("Enter price per Kg");
				pricePerKg=sc.nextInt();
				FruitBasket fbObj=new FruitBasket(fruitName,weightInKgs,pricePerKg);
				utilObj.addToBasket(fbObj);
				break;
			case 2:
				// Fill your code here
				// here i was making the mistake of not identifying 
				// what the utilObj is 
				// it is the object of the FruitBasketUtility class 
				// and inside of it has the getFruitBasketList method which rerturns the list 
				// and we can directly change the li to stream using the . operator like this 
				// utilObj.getFruitBasketList().stream 
				
				// and as utilObj.getFruitBasketList() is an list we can get the size using 
				// the size method 
				if(utilObj.getFruitBasketList().size()==0)
				{
				    System.out.println("Your basket is empty. Please add fruits.");
				}
				else
				{
				    int ans = utilObj.calculateBill(utilObj.getFruitBasketList().stream());
				    System.out.println("The estimated bill amount is Rs "+ans);
				    
				}
				break;
                




			case 3:
				System.out.println("Thank you for using the application.");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}

		}while(option!=3);

	}

}

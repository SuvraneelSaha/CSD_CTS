package JavaTraining.Week3.Day1;

import java.util.Scanner;

public class O8 {
  public static void main(String[] args) {
       Shape shape=null;// Can create interface type object
          //But we could not create the reference for the interface
//          shape=new Circle();//Dynamic Binding
//          shape.calculateArea();
//          shape.display();
//          
//          shape=new Square();
//          shape.calculateArea();
//          shape.display();
          Scanner input=new Scanner(System.in);
          String shapeType=input.nextLine();
          if(shapeType.equalsIgnoreCase("circle")) {
        	  shape=new Circle();
          }else if(shapeType.equalsIgnoreCase("circle")){
        	  shape=new Circle();
          }else {
        	  System.out.println("Invalid Shape");
        	  System.exit(0);
          }

          shape.display();
  }
}
/*
* 100% abstraction
*/
public interface Shape {
	public float calculateArea();
	public void display();
 
}

public class Square implements Shape{
  @Override
  public float calculateArea()
  {
    return 3*3;

  }

  @Override
	public void display()
   {
		System.out.println("In Square="+calculateArea());
	}
}

public class Circle implements Shape{
 
	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return 2*2;
	}
 
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("In Circle "+calculateArea());
	}

}


/*

* partial abstraction

*/

public abstract class Shape {

	public abstract float calculateArea();

	public void display() {

		// TODO Auto-generated method stub

		System.out.println(calculateArea());

	}
 
}

 
package JavaTraining.Week3.Day2;
/*
	 * I need one application for Inventory Management. I have two different 
	 * categories of products (Accessories and clothes) . Discount Caluclation 
	 * is differntb for each category.
	 * 
	 * for Accessories 10% discount from total amount
	 * and for clothes 30% discount from each product price if the discount 
	 * exceeds 100Rs then set discount as 120Rs. 
	 */
public class O1 {
  public static void main(String[] args) {
    
  }
}
class Accessories{
  private int price;
  private double discounted_Price;


  public void setAcc_Price(int price) {
    this.price = price;
  }

   public double getDiscountedPrice() {
    return 0.0;
  }



}

class Clothes{
private double width;
}
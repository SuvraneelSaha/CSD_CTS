package JavaTraining.Week3.Day3;

import java.util.ArrayList;

public class O6 {
  public static void main(String[] args) {


    ProductBO pbo = new ProductBO() ; 


    pbo.addProduct(new Clothes(1,"abc",12));
    pbo.addProduct(new Accessories(2,"xyz",87));
    pbo.addProduct(new Accessories(3,"xyzz",87));

    for(Product p : pbo.getAllProduct())
    {
      System.out.println(p);

      p.discountCalculation();
    }



		System.out.println(p==null?"No such Product":p);
		System.out.println(pbo.getAllProduct());
		System.out.println(pbo.deleteProduct(2));



  }
}
 abstract class Product {
	private int pid;
	private String pname;
	private float price;
	public Product(int pid, String pname, float price) {
		super();//By default in java all classes extends from Object class
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return pid + ":" + pname + ": " + price ;
	}
	public abstract void discountCalculation();
}

 class Accessories extends Product{
	public Accessories(int pid, String pname, float price) {
		super(pid, pname, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void discountCalculation() {
		// TODO Auto-generated method stub
		System.out.println(this.getPrice()*0.10);
	}
}

 class Clothes extends Product{
 
	public Clothes(int pid, String pname, float price) {
		super(pid, pname, price);
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public void discountCalculation() {
		// TODO Auto-generated method stub
		System.out.println(this.getPrice()*0.20);
	}

 
}

class ProductBO
{
  ArrayList<Product> list1 = new ArrayList<Product>() ;
public void addProduct(Product product)
{
  list1.add(product);
}

public ArrayList<Product> getAllProduct()
{
  return list1;
}




public boolean deleteProduct(int id)
{
 boolean isDeleted=false;
	for (int i = 0; i < list1.size(); i++) {
		Product p=list1.get(i);
		if(p.getPid()==id) {
			list1.remove(i);
			isDeleted=true;
			break;
		}
	}
	return isDeleted;
}


}
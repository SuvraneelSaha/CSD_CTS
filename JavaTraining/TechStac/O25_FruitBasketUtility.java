import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors; 


public class FruitBasketUtility {
	private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();

	public List<FruitBasket> getFruitBasketList() {
		return fruitBasketList;
	}

	public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
		this.fruitBasketList = fruitBasketList;
	}

	public void addToBasket(FruitBasket fbObj) {
		// Fill your code here
            fruitBasketList.add(fbObj);
    
	}

	public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
		
		// Fill your code here
		List<Integer> li = new ArrayList<Integer>();
		// the problem here was coming that it was showing type mismatch 
		// because of ArrayList 
		
		// here i was making a mistake of giving ArrayList for the datatype 
		// sol was to take the ArrayList from the List 
		
		li = fruitBasketStream.map(s -> s.getWeightInKgs()*s.getPricePerKg()).collect(Collectors.toList());
		// in short we are coverting the stream of the required numbers into a list 
		
		// here the fruitBasketStream is a stream we are operating map on it 
		// to get the price (.getPricePerKg * .getWeightInKgs) 
		// and we are collecting the elements by using the collect(Collectors.toList())
		
		int sum = 0 ; 
		
		for(int i = 0 ; i < li.size();i++)
		{
		    sum = sum + li.get(i);
		}
		
		return sum ; 
		
	
	}

}

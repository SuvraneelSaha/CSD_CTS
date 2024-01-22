public class O1{
  public static void main(String[] args)
  {

  } /*
		 * Predicate
		 */
		Predicate<String> validator = (str) -> str.matches("[0-9]+");
		System.out.println(validator.test("oi98"));
 
		validator = str -> str.length() >= 4;
		System.out.println(validator.test("welc"));
 
		Predicate<Integer> numberValidator = n -> n <= 9;
		System.out.println(numberValidator.test(9));
		Function<Integer,Integer> f1=(n)->n+1;
		System.out.println(f1.apply(10));
		Consumer<Integer> c=(n)->{
			n=n/2;
			System.out.println(n);
		};
		c.accept(12);
}
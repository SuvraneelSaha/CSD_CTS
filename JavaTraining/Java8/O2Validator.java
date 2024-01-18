package JavaTraining.Java8;

public class O2Validator {
  public static void main(String[] args) {
    Validator validator;


		validator=(str)->str.matches("[A-Z]{6}[0-9]{2}[A-Z]{2}[0-9]{3}");


		System.out.println(validator.validate("CSDCIS24CS001"));
	
    validator=(str)->str.contains("@") && str.endsWith(".com");
		
    System.out.println(validator.validate("abc@gmail.com"));
  }
}
interface Validator{
  public boolean validate(String str);
}
class Utility{
  public static Validator emailValidator() {
		return (str)->str.contains("@") && str.endsWith(".com");
	}
	public static Validator cohortCodeValidator() {
		return (str)->str.matches("[A-Z]{6}[0-9]{2}[A-Z]{2}[0-9]{3}");
	}
}
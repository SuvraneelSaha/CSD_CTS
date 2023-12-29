package JavaTraining.Day3;

public class O12 {
  public static void main(String[] args) {
    /*To conver Primitive to String */
		int n=10;
		String s=String.valueOf(n);
		char c='a';
	    s=String.valueOf(c);
	    boolean b=true;
	    s=String.valueOf(b);

	    /*
	     * To convert String to primitive
	     */
	    String ss="10";
	    int a=Integer.parseInt(ss);
	    ss="12.3";
	    float f=Float.parseFloat(ss);
	    System.out.println();
  }
}

package JavaTraining.Week4;

public class POTD {
  public static void main(String[] args) {
    // Factorial of a Number 
    System.out.println(Fact(1));
  }
  public static int Fact(int n)
  {
    int ans = 1;

    while (n>1)
    {
      ans = ans * n ; 
      n--;
    }
    return ans ; 

  }
}

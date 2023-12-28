package JavaTraining.Day2.Day2_JavaTrainingSession;

import java.util.Arrays;

public class O9_Arrays_stream {
  public static void main(String[] args) {
    int[] arr = {11,21,3,5,7};

   int sum =  Arrays.stream(arr).sum();
   System.out.println("Elements : ");
    System.out.println(sum);

    Arrays.stream(arr).forEach(System.out::println);
  }
}

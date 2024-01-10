package JavaTraining.Week3.Day1;


import java.util.Scanner;

public class O9 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int firstAttemptScore[] = {12,90,23,19,3,48};

    int secondAttemptScore[] = {23,70,3,78};

    int outputArray[] = new int[firstAttemptScore.length/2];

    for (int i = 0; i < firstAttemptScore.length; i=i+2) {
      int id = firstAttemptScore[i];

      int score = firstAttemptScore[i+1];

      for (int j = 0; j < secondAttemptScore.length; j++)
      {
        if(score>secondAttemptScore[j])
        {
          outputArray[i++]=score>secondAttemptScore[j]?score
        }  
      }
    }
  }
}

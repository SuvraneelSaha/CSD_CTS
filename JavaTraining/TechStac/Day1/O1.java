package JavaTraining.TechStac.Day1;

import java.util.Scanner;

public class O1 {
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the no of students placed in CSE:");
        int cs = in.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ec = in.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int mec = in.nextInt();
        
        if(cs<0 || ec<0 || mec<0)
        {
            System.out.println("Input is Invalid");
        }
        else if((cs==ec && cs==mec && mec==ec ))
        {
            System.out.println("None of the department has got the highest placement");
        }
        else
        {
            if(cs==ec && cs>mec)
            {
              System.out.println("Highest placement");
              System.out.println("CSE");
              System.out.println("ECE");
            } 
            else if(cs==mec && cs>mec)
            {
              System.out.println("Highest placement");
              System.out.println("CSE");
              System.out.println("MECH");
            }
            else if(ec==mec && ec>mec)
            {
              System.out.println("Highest placement");
              System.out.println("ECE");
              System.out.println("MECH");
            }
            else
            {
              int ans = 0 ;
              ans = Math.max(Math.max(cs, ec),mec);

              if(ans==cs)
              {
                System.out.println("Highest placement");
                System.out.println("CSE");
              }
              else if(ans==ec)
              {
                  System.out.println("Highest placement");
                  System.out.println("ECE");
              }
              else if(ans==mec)
              {
                  System.out.println("Highest placement");
                  System.out.println("MECH");
              }
            }
        }
        
  }
}

/*
 * int ans = 0 ; 
            ans = Math.max(Math.max(cs,ec),mec);
            
            if(ans == cs)
            {
                System.out.println("Highest placement");
                System.out.println("CSE");
            }
            else if(ans == ec)
            {
                System.out.println("Highest placement");
                System.out.println("CSE");
            }
            else
            {
              
            }
 */
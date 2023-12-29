package JavaTraining.Day3;

public class O8 {
  public static void main(String[] args) {
    
  
  String cohortCode = "CSDCIS24CS027";
 
		String str1 = cohortCode.substring(0, 6);
		String str2=cohortCode.substring(6,8);
		String str3=cohortCode.substring(8,10);
		int n=Integer.parseInt(cohortCode.substring(10));
		String nextCohortCode="";

			nextCohortCode=n>=10 && n<=99?
					str1+str2+str3+"0"+(n+1):(n>=100?str1+str2+str3+(n+1):str1+str2+str3+"00"+(n+1));

   System.out.println(nextCohortCode);
 
		// CSDFSD24JS001
  }
}

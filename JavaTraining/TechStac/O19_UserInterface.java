import java.util.*;
public class UserInterface {
   
   public static CommissionInfo generateCommissionObtained ()
    {
        CommissionInfo c = ticketObj ->{
            double ans = 0.0;
            if(ticketObj.getClassType().equalsIgnoreCase("1A")||ticketObj.getClassType().equalsIgnoreCase("2A")||ticketObj.getClassType().equalsIgnoreCase("3A"))
            {
                ans = 100;
            }
            else if(ticketObj.getClassType().equalsIgnoreCase("SL")||ticketObj.getClassType().equalsIgnoreCase("2S"))
            {
                ans = 60 ;
            }
            return ans;
        };
        return c;
    }
    
   public static void main(String args[]) {
        
    // Fill the code here
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the no of passengers");
    int n = Integer.parseInt(in.nextLine());
    
    Ticket[] ticketObjectArr = new Ticket[n];
    
    double ans = 0.0;
    
    for (int i =0,j=1 ;i<n ;i++,j++)
    {
        System.out.println("Details of Passenger "+j+":");
        System.out.println("Enter the pnr no:");
        long pnrNo = Long.parseLong(in.nextLine());
        
        System.out.println("Enter passenger name:");
        String passengerName = in.nextLine();
        
        System.out.println("Enter seat no:");
        int seatNo = Integer.parseInt(in.nextLine());
        
        System.out.println("Enter class type:");
        String classType = in.nextLine();
        
        System.out.println("Enter ticket fare:");
        double ticketFare = Double.parseDouble(in.nextLine());
        
        Ticket obj = new Ticket( pnrNo, passengerName, seatNo, classType, ticketFare);
        
        ticketObjectArr[i] = obj;
        
        
        CommissionInfo c = generateCommissionObtained();
    
        double com = c.calculateCommissionAmount(obj);
        
        ans = ans + com;
        
        
    }
    
    System.out.println("Commission Obtained");
    
    System.out.printf("Commission obtained per each person: Rs.%.2f",ans);
    
    
    
    
    
    
}
    
    
}
import java.util.*;
import java.util.regex.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
        Scanner in = new Scanner(System.in);
        
        String employeeName = in.nextLine();
        
        String productName = in.nextLine();
        
        boolean isValidEmployeeName = validateEmployeeName().validateName(employeeName);
        
        boolean isValidProductName = validateProductName().validateName(productName);
        
        if(isValidEmployeeName == true)
        {
            System.out.println("Employee name is valid");
        }
        else
        {
            System.out.println("Employee name is invalid");
        }
        
        if(isValidProductName == true)
        {
            System.out.println("Product name is valid");
        }
        else
        {
            System.out.println("Product name is invalid");
        }
        
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        // this function will return true if if it 
        //contains alphabets and space and it should
        //contain minimum 5 characters 
        //and maximum 20 characters.
        Validate obj = (name) ->
        {
            boolean check = false;
            if(name.length() >=5 && name.length() <= 20)
            {
                if(name.matches("[a-zA-z ]+"))
                {
                    check = true;
                    
                }
            }
            return check;
            
            
        };
        
        return obj;
        
    }
    
    
    public static Validate validateProductName() 
    {
        //fill code here
        // this lamda function will return true 
        // if the first character is an alphabet and followed by 5 digits 
        // else return false 
        Validate obj1 = (name1) ->
        {
            boolean check = false ;
           
                if(name1.matches("[a-zA-Z]{1}[0-9]{5}"))
                {
                    check =  true;
                }
            
            return check;
        };
        return obj1;
        
    }
}
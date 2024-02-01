import java.util.*;
public class O17
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
        
    while(true)
    {
        
    
    System.out.println("Menu");
    
    System.out.println("1.Add Contact");
    
    System.out.println("2.Display all contacts");
    
    System.out.println("3.Search contact by phone ");
    
    System.out.println("4.Remove contact");

    System.out.println("5.Exit");
    
    System.out.println("Enter your choice: ");
    
    int choice = Integer.parseInt(in.nextLine());
    
    PhoneBook phonebookObj = new PhoneBook();
    
    
    Contact contactObj;
    
    if(choice == 5)
    {
        break;
    }
    else if(choice == 1)
    {
        System.out.println("Add a Contact:");
        
        System.out.println("Enter the First Name: ");
        String firstName = in.nextLine();
        
        
        System.out.println("Enter the Last Name: ");
        String lastName = in.nextLine();
        
        System.out.println("Enter the Phone No.: ");
        
        long phoneNumber = Long.parseLong(in.nextLine());
        
        System.out.println("Enter the Email: ");
        String emailId = in.nextLine();
        
        contactObj = new Contact(firstName,lastName,phoneNumber,emailId);
        
        phonebookObj.addContact(contactObj);
        
    }
    else if(choice == 2)
    {
        List<Contact> li = phonebookObj.viewAllContacts();
        
        
        System.out.println("The contacts in the List are:");
        
        for (Contact cc : li )
        {
            System.out.println("First Name: "+cc.getFirstName());
            System.out.println("Last Name: "+cc.getLastName());
            System.out.println("Phone No.: "+cc.getPhoneNumber());
            System.out.println("Email: "+cc.getEmailId());
        }
                        
    }
    else if(choice == 3)
    {
        // viewContactGivenPhone
        
        System.out.println("Enter the Phone number to search contact:");
        long phoneNumber = Long.parseLong(in.nextLine());
        
        Contact obj2 = phonebookObj.viewContactGivenPhone(phoneNumber);
        
                System.out.println("First Name: "+obj2.getFirstName());
                System.out.println("Last Name: "+obj2.getLastName());
                System.out.println("Phone No.: "+obj2.getPhoneNumber());
                System.out.println("Email: "+obj2.getEmailId());
    }
    else if(choice == 4)
    {
        System.out.println("Enter the Phone number to remove :");
        long phoneNumber = Long.parseLong(in.nextLine());
        
        if(phonebookObj.removeContact(phoneNumber))
        {
            System.out.println("Do you want to remove the contact (Y/N): ");
            String s = in.nextLine();
            
            if(s.equals("Y"))
            {
                System.out.println("The contact is successfully deleted.");
            }
            
        }
        
    }
    
}
  }
}
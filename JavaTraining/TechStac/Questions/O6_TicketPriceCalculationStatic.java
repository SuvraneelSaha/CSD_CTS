package JavaTraining.TechStac.Questions;
import java.util.Scanner;

public class O6_TicketPriceCalculationStatic {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter no of bookings:");
    int n = Integer.parseInt(in.nextLine());

    System.out.println("Enter the available tickets:");
    int availableTickets = Integer.parseInt(in.nextLine());

    for (int i = 0; i < n; i++) {
      System.out.println("Enter the ticketid:");
      int ticketid = Integer.parseInt(in.nextLine());

      System.out.println("Enter the price:");
      int price = Integer.parseInt(in.nextLine());

      System.out.println("Enter the no of tickets:");
      int noOfTickets = Integer.parseInt(in.nextLine());

      Ticket obj = new Ticket();

      obj.setAvailableTickets(availableTickets);

      obj.setTicketid(ticketid);

      obj.setPrice(price);

      System.out.println("Available tickets:" + obj.getAvailableTickets());

      System.out.println("Total amount:" + obj.calculateTicketCost(noOfTickets));

      System.out.println("Available ticket after booking:" + obj.getAvailableTickets());
    }

  }
}

class Ticket {
  // instance variables

  // instance variables

  private int ticketid;
  private int price;
  private static int availableTickets;

  // setter for the ticketPrice
  public void setPrice(int price) {
    this.price = price;
  }

  // setter for the ticketId
  public void setTicketid(int ticketId) {
    this.ticketid = ticketId;
  }

  // setter for the AvailableTickets
  public static void setAvailableTickets(int avalTickets) {
    if (avalTickets > 0) {
      availableTickets = avalTickets;
      // changed
    }
  }

  // GETTER Functions

  // getter for the ticket price
  public int getPrice() {
    return this.price;
  }

  // getter for the ticketId
  public int getTicketid() {
    return this.ticketid;
  }

  // getter for the Available Tickers
  public static int getAvailableTickets() {
    return Ticket.availableTickets;
    // changed
  }

  public int calculateTicketCost(int noOfTickets) {
    if (Ticket.getAvailableTickets() > noOfTickets) {
      int rem = Ticket.availableTickets - noOfTickets;

      int amount = noOfTickets * price;
      setAvailableTickets(rem);

      return amount;
    } else {
      return -1;
    }
  }

}
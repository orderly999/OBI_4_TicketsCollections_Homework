package pw.obi;

public class Ticket {
  private Passenger passenger;
  int numberOfSeat;
  double price;
  
  public Ticket(Passenger passenger, int numberOfSeat, double price)
  {
	  this.passenger =  passenger;	  
	  this.numberOfSeat = numberOfSeat;
	  this.price = price;
  }
  
  
  
}
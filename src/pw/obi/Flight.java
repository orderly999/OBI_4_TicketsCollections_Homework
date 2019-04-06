package pw.obi;

public class Flight {
	
   private Ticket[] tickets;
   private String departureFrom;	
   private String flightTo;
   private int numberOfTickets;
   private int reservedTickets;
   private double priceForTicket;
   
   public Flight(int numberOfTickets, String departureFrom, String flightTo, double priceForTicket)
   {
	   this.numberOfTickets = numberOfTickets;
	   this.departureFrom = departureFrom;
	   this.flightTo = flightTo;   
	   this.priceForTicket = priceForTicket;
	   this.reservedTickets = 0;
	   tickets = new Ticket[this.numberOfTickets];
   }
   
   String reserveTicket(Passenger passenger)
   {
	   if (!addTicket(passenger))		   
	       return "Nie udało się zarezerwować biletu. Brak miejsc na pokładzie.";
	   else
	   {
		   this.reservedTickets++;    
		   return "Dodano rezerwację dla pasażera " + passenger.getName() + " " + "numer miejsca: " + reservedTickets;
	   }
   }
   
   private boolean addTicket(Passenger passenger)
   {
	  if (reservedTickets == numberOfTickets)
		  return false;
	  else
	  {
		  tickets[reservedTickets] = new Ticket(passenger, reservedTickets, priceForTicket);
		  return true;
	  }
   }
   
   public int getNumberOfReservedTickets()
   {  
	   return reservedTickets; 
   }
   
   public double getPriceForTicket()
   {  
	   return priceForTicket; 
   }
   
   
   public String getDepartureFrom()
   {  
	   return departureFrom; 
   }
   
   public String getFlightTo()
   {  
	   return flightTo; 
   }
}

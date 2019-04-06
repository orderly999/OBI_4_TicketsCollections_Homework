package pw.obi;

import java.util.HashMap;

public class System {

	private HashMap<String, Flight> flightByDepartureFromCollection;
	private HashMap<String, Flight> flightByDepartureFlightToCollection;
	private HashMap<String, Passenger> passengersByIDCollection;
	private HashMap<String, Passenger> passengersByNameCollection;
	
	public System()
	{
		flightByDepartureFromCollection = new HashMap<String, Flight>();
		flightByDepartureFlightToCollection = new HashMap<String, Flight>();
		passengersByIDCollection = new HashMap<String, Passenger>();
		passengersByNameCollection = new HashMap<String, Passenger>();				
	}
	
	
	public void addPassenger(Passenger passenger)
	{
		passengersByIDCollection.put(passenger.getID(), passenger);
		passengersByNameCollection.put(passenger.getName(), passenger);
	}
	
	
	public void addFlight(Flight flight)
	{
		flightByDepartureFromCollection.put(flight.getDepartureFrom(), flight);
		flightByDepartureFlightToCollection.put(flight.getFlightTo(), flight);
	}
	
	public void removePassenger(Passenger passenger)
	{
		passengersByIDCollection.remove(passenger.getID());
		passengersByNameCollection.remove(passenger.getName());
	}
	
	
	public void removeFlight(Flight flight)
	{
		flightByDepartureFromCollection.remove(flight.getDepartureFrom());
		flightByDepartureFlightToCollection.remove(flight.getFlightTo());
	}
	
	public Flight findFlightByDepartureFrom(String DepartureFrom)
	{
		return flightByDepartureFromCollection.get(DepartureFrom);	
	}
	
	public Flight findFlightByFlightTo(String FlightTo)
	{
		return flightByDepartureFlightToCollection.get(FlightTo);	
	}
	
	
	public Passenger findPassengerByName(String name)
	{
		return passengersByNameCollection.get(name);
	}
	
	public Passenger findPassengerByID(String id)
	{
		return passengersByIDCollection.get(id);		
	}
	
}
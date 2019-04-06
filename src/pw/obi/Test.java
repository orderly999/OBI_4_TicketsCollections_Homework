package pw.obi;

import java.nio.charset.Charset;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws EmptyNameException, EmptyIdException {
		
	SystemReservation sys = new SystemReservation();
	Flight flight = new Flight(180, "WAW", "PAR", 99.99);	
	
	Passenger passenger1 = null;
	Passenger passenger2 = null;
	Passenger passenger3 = null;
	
	try {
	passenger1 = new Passenger("Kowalski Jan", "87121289234");
	passenger2 = new Passenger("", "87121289237");
	passenger3 = new Passenger("Jan Nowak", "");
	
	
		
	} catch (EmptyNameException e) {
		e.printStackTrace();
		System.out.println("Wystapil wyjatek od pustego nazwiska");
	} catch (EmptyIdException e) {
		e.printStackTrace();
		System.out.println("Wystapil wyjatek od pustego id");
	}
	
	finally {
	
	sys.addPassenger(passenger1);	
	//sys.addPassenger(passenger2);
	//sys.addPassenger(passenger3);
	
	for (int i = 0; i < 190; i++ )
	{
		Passenger passenger = new Passenger(generateRndomName(), generateRndomID());
		sys.addPassenger(passenger);
		System.out.println(flight.reserveTicket(passenger));
	}
	
	System.out.println("Zarezerwowano łącznie " + flight.getNumberOfReservedTickets() + " biletów za kwotę: " + flight.getPriceForTicket()
	+ "$ na tym locie linie lotnicze zarobią " + (double)(flight.getNumberOfReservedTickets()*flight.getPriceForTicket()) + " $");
	
	System.out.println("Nazwisko wyszukanego pasażera to: " + sys.findPassengerByID("87121289234").getName());
	}
	}
	
	
	public static String generateRndomName() {
	       String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        StringBuilder salt = new StringBuilder();
	        Random rnd = new Random();
	        while (salt.length() < 12) { // length of the random string.
	            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	            salt.append(SALTCHARS.charAt(index));
	        }
	        String saltStr = salt.toString();
	        return saltStr;
	}

	
	public static String generateRndomID() {
	       String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
	        StringBuilder salt = new StringBuilder();
	        Random rnd = new Random();
	        while (salt.length() < 12) { // length of the random string.
	            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	            salt.append(SALTCHARS.charAt(index));
	        }
	        String saltStr = salt.toString();
	        return saltStr;
	}
	
}

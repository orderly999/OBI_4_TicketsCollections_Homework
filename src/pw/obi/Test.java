package pw.obi;

import java.nio.charset.Charset;
import java.util.Random;

public class Test {

	public static void main(String[] args) {

	Flight flight = new Flight(180, "WAW", "PAR", 99.99);	
	SystemReservation sys = new SystemReservation();
	
	Passenger passenger1 = new Passenger("Kowalski Jan", "87121289234");
	sys.addPassenger(passenger1);
	
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

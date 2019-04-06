package pw.obi;

import java.nio.charset.Charset;
import java.util.Random;

public class Test {

	public static void main(String[] args) {

	Flight flight = new Flight(180, "WAW", "PAR", 99.99);	
	
	
	for (int i = 0; i < 190; i++ )
	{
		Passenger passenger = new Passenger(generateRndomName(), generateRndomID());	
		SystemReservation.out.println(flight.reserveTicket(passenger));
	}
	
	SystemReservation.out.println("Zarezerwowano łącznie " + flight.getNumberOfReservedTickets() + " biletów za kwotę: " + flight.getPriceForTicket()
	+ "$ na tym locie linie lotnicze zarobią " + (double)(flight.getNumberOfReservedTickets()*flight.getPriceForTicket()) + " $");

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

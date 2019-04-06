package pw.obi;

public class EmptyIdException extends Exception {
	
	public EmptyIdException() 
	{
		super("Podano pusty identyfikator");		
	}
}

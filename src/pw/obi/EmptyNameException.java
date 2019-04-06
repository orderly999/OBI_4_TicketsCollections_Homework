package pw.obi;

public class EmptyNameException extends Exception {
	
   public EmptyNameException()
   {
	 super("Podano puste nazwisko");     
   }
}

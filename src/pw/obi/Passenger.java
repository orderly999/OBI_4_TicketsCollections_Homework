package pw.obi;

import java.util.ArrayList;

public class Passenger {

	private String name;
	private String id;
	ArrayList<Ticket> ticketList;
	
	public Passenger(String name, String id) throws EmptyNameException, EmptyIdException
	{
		if (id.equals(""))
			throw new EmptyIdException();
		this.id = id;	
		if (name.equals(""))
			throw new EmptyNameException();
		this.name = name;
	}
	
	public void changeId(String newId)
	{
		this.id = newId;
	}
	
	public String getName()
	{
		return name;			
	}
	
	public String getID()
	{
		return id;			
	}
	
    public void addTicket(Ticket ticket)
	{
    	ticketList.add(ticket);
    }
	
}

package in.ait.service;

import in.ait.request.Passenger;
import in.ait.response.Ticket;

public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}

package designPattern.observer;

public class TicketStatusImpl implements TicketStatus{
    @Override
    public void update(String ticketId, String newStatus) {
        System.out.println("Ticket " + ticketId + " status changed to: " + newStatus);
    }
}

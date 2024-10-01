package designPattern.observer;

public class Main {
    public static void main(String[] args) {

        // Create a new ticket
        Ticket ticket = new Ticket("ticket01");

        // Create an observer
        TicketStatusImpl ticketStatus= new TicketStatusImpl();

        // Register the observer to the ticket
        ticket.addObserver(ticketStatus);

        // Change the status of the ticket and notify the observer
        ticket.setStatus("In Progress");
        ticket.setStatus("closed");

    }
}

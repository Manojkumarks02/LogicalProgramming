package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private String ticketId;
    private String status;
    private List<TicketStatus> observers = new ArrayList<>();

    public Ticket(String ticketId) {
        this.ticketId = ticketId;
        this.status = "Open";  // Default status
    }

    // Method to add an observer
    public void addObserver(TicketStatus observer) {
        observers.add(observer);
    }

    // Method to change the status and notify observers
    public void setStatus(String newStatus) {
        this.status = newStatus;
        notifyObservers();  // Notify all observers of the status change
    }

    // Method to notify all observers
    private void notifyObservers() {
        for (TicketStatus observer : observers) {
            observer.update(ticketId, status);  // Notify each observer
        }
    }
}

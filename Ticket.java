package Project_1;

public class Ticket implements Comparable<Ticket> {
    //private User user;  
    private Event event; 
    private String ticketID;

    public Ticket(User user, Event event) {
        //this.user = user;
        this.event = event;
        this.ticketID = generateTicketID();  
        //initialzing variables being used in the class
    }

    public Event getEvent() {return event;}
    //getter method

    private String generateTicketID() {
        return "TICKET-" + (int)(Math.random() * 10000);  
        // Creates a random number between 0 and 9999, for ticket #
    }
    @Override
    public String toString() {
        return String.format("Ticket ID: %s\nEvent: %s", ticketID, event.getEventName());
        //Overriding toString() method for ticket class
    }

    @Override
    public int compareTo(Ticket otherTicket) {
        // Using the comparator interface to compare based on event price
        return Double.compare(this.event.getPrice(), otherTicket.event.getPrice());
    }
}

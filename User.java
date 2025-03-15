package Project_1;

import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private String userID;
    private ArrayList<Ticket> tickets;

    public User(String userID, String name, String email){
        this.name = name;
        this.email = email;
        this.userID = userID;
        this.tickets = new ArrayList<>();
        //Initialzing variables used in the class, along with an ArrayList
    }

    public Ticket bookTicket(Event event) {
        for(Ticket ticket : tickets){
            if (ticket.getEvent().equals(event)) {
                System.out.println("");
                System.out.println("There already exists a ticket for this event. - " + event.getEventName());
                return null;
                //Checking if a pre-existing ticket already texts for specified event, returning null
            }
        }

        System.out.println("");
        System.out.println("Booking ticket for " + getName() + "...");
        Ticket newTicket = new Ticket(this, event);  
        tickets.add(newTicket);  
        System.out.println("Congrats! " + name + "'s ticket has been booked for event: " + event.getEventName());
        return newTicket; // Returning the ticket reference and details
    }
    

    public void viewTickets() {
        System.out.println("Remaining tickets for: " + getName());
        System.out.println("-----------------------------------------");
        System.out.println(getName() + "'s booked Events: ");
        if(tickets.isEmpty()){
            System.out.println("Ticket does not exist.");
            //Checking if ArrayList is empty, 
        }
        else{
        for (Ticket ticket : tickets) {
            System.out.println(ticket.toString());
            }
            //Going through tickets, printing all events
        }
        System.out.println("------------------------------------------");
    }

    public void cancelBooking(Ticket ticket) {
        System.out.println("");
        System.out.println("Cancelling ticket for " + getName() + "...");
        if (tickets.contains(ticket)) {
            tickets.remove(ticket); 
            System.out.println("Ticket cancelled: " + ticket.toString());
            System.out.println("");
        } else {
            System.out.println("Ticket not found in user's booking history.");
        }
        //Checking through all bookings, cancelling if possible
    }

    public String getName(){
        return name;
        //getter method
    }
    public String getEmail(){
        return email;
        //getter method
    }
    public String userID(){
        return userID;
        //getter method
    }
}

package Project_1;
/*
 * Problem Description:
 * 
  This project addresses the challenge of managing and organizing event data in a dynamic, user-friendly
  booking system similar to Ticketmaster. The EventManager component efficiently stores events using a 
  HashMap for quick retrieval, and provides methods to display and sort events by key attributes such as 
  price and date. This enables users to easily browse and select events based on their preferences, ensuring 
  a responsive and scalable system that leverages core object-oriented programming principles.
 */

import java.util.ArrayList;

public class ProjectOneTester{
    public static void main(String[] args) {

        // Create events
        Concert event1 = new Concert("E000", "Weeknd Concert", "2025-4-27", "ScotiaBank", 350.0, "The Weeknd");
        Theater event2 = new Theater("E001", "Sonatra","2025-2-10", "Atlantis", 250.0, "The Odyssey");
        SportEvent event3 = new SportEvent("E003","Bulls vs Raptors" , "2025-10-31", "SonaFi", 2000.0, "Chicago Bulls", "Toronto Raptors");
        
        // Create a user
        User Shrey = new User("U001", "Shrey", "s1panchal@torontomu.ca");

        // Book tickets for events (each call returns a Ticket)
        Ticket ticket1 = Shrey.bookTicket(event1);
        //Ticket ticket2 = Shrey.bookTicket(event2);
        //Ticket ticket3 = Shrey.bookTicket(event2);
        //Ticket ticket4 = Shrey.bookTicket(event3);
        
        // Show an event's details using its toString method
        System.out.println(event3.toString());
        
        // Cancel one ticket (ticket1)
        Shrey.cancelBooking(ticket1);
        
        // Display remaining tickets after cancellation
        Shrey.viewTickets();

        // --- Comparing / Sorting Demonstrations --- // 

        // Compare and sort events by price using EventManager's method
        EventManager eventManager = new EventManager();
        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        
        System.out.println("\nEvents Sorted by Price:");
        ArrayList<Event> sortedByPrice = eventManager.getSortedEventsByPrice();
        for (Event e : sortedByPrice) {
            System.out.println(e.getEventName() + " - $" + e.getPrice());
        }
        
        // Compare and sort events by date using EventManager's method
        System.out.println("\nEvents Sorted by Date:");
        ArrayList<Event> sortedByDate = eventManager.getSortedEventsByDate();
        for (Event e : sortedByDate) {
            System.out.println(e.getEventName() + " - " + e.getDate());
        }
    }
}

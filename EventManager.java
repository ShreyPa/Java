package Project_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class EventManager {
    private HashMap<String, Event> eventMap;  
    //creating hashmap to store values of eventName, event class

    public EventManager() {
        eventMap = new HashMap<>();
    }

    public void addEvent(Event event) {
        eventMap.put(event.getEventID(), event);
        //adding events into hashmap
    }

    public void displayEvents() {
        if (eventMap.isEmpty()) {
            System.out.println("No events available.");
            //checking for empty hashmap
        } else {
            for (Event event : eventMap.values()) {
                System.out.println(event);
            }
            //displaying all values present in hashmap
        }
    }


    public ArrayList<Event> getSortedEventsByPrice() {
        ArrayList<Event> eventList = new ArrayList<>(eventMap.values());  
        //convering hashmap -> Arraylist for easier sorting 
        Collections.sort(eventList, new Comparator<Event>() {
            //calliing the sort
            @Override
            public int compare(Event e1, Event e2) {
                return Double.compare(e1.getPrice(), e2.getPrice());
                //using the Comparable interface to compare based on pricing 
            }
        });
        return eventList;
    }


    public ArrayList<Event> getSortedEventsByDate() {
        ArrayList<Event> eventList = new ArrayList<>(eventMap.values());  
        // converting hashmap -> Arraylist for easier sorting
        Collections.sort(eventList, new Comparator<Event>() {
            //calling the sort 
            @Override
            public int compare(Event e1, Event e2) {
                return e1.getDate().compareTo(e2.getDate());
                //sorting based on soonest date
            }
        });
        return eventList;
    }
}

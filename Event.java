package Project_1;

public class Event {
    private String eventID;
    private String name;
    private String date;
    private String location;
    private double price;

    public Event(String eventID, String name, String date, String location, double price) {
        this.eventID = eventID;
        this.name = name;
        this.date = date;
        this.location = location;
        this.price = price;
        //initializing all varibles used in the class
    }

    public String getEventID() { return eventID; }
    public String getEventName() { return name; }
    public String getDate() { return date; }
    public String getLocation() { return location; }
    public double getPrice() { return price; }
    //getter methods
    


    public void setEventID(String eventID) { this.eventID = eventID; }
    public void setName(String name) { this.name = name; }
    public void setDate(String date) { this.date = date; }
    public void setLocation(String location) { this.location = location; }
    public void setPrice(double price) { this.price = price; }
    //setter methods

    @Override
    public String toString() {
        return  "----------------------------------------"+
                "\nGetting details for " + this.getEventName() + "..." +
                "\nEvent ID: " + eventID +
               "\nName: " + name +
               "\nDate: " + date +
               "\nLocation: " + location +
               "\nPrice: $" + price+
               "\n----------------------------------------";
    }
    //Overriding toString to display event details
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Event event = (Event) obj;
        return eventID.equals(event.eventID);  
        //comparing two events 
    }
}


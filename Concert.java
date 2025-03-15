package Project_1;

public class Concert extends Event {
    private String artistName;
    
    public Concert(String eventID, String name, String date, String location, double price, String artistName ){
        super(eventID, name, date, location, price);
        this.artistName = artistName;
        //initializing variables being used, using super class for remaining others
    }

    @Override
    public String toString(){
        return "EventID : " + getEventID() +
                "\nArtist Name: " + artistName +
                "\nDate: " + getDate() +
                "\nLocation: " + getLocation() +
                "\nPrice: " + getPrice();
                //Overriding toString method for Concert class
    } 
}

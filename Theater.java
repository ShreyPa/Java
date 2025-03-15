package Project_1;

public class Theater extends Event {
    private String playTitle;
    
    public Theater(String eventID, String name, String date, String location, double price, String playTitle) {
        super(eventID, name, date, location, price);
        this.playTitle = playTitle;
        //Initialzing variables being used, using super class for remaining
    }
    
    @Override
    public String toString(){
        return "EventID : " + getEventID() +
                "\nTitle: " + playTitle +
                "\nDate: " + getDate() +
                "\nLocation: " + getLocation() +
                "\nPrice: " + getPrice();
                //Overriding toString() method, for Theater class
    } 

}

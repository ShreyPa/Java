package Project_1;

public class SportEvent extends Event {
    private String team1;
    private String team2;


    public SportEvent(String eventID, String name, String date, String location, double price, String team1, String team2) {
            super(eventID, name, date, location, price);
            this.team1 = team1;
            this.team2 = team2;
            //Initialzing variables being used, super for the remaining variables
    }


    @Override
    public String toString(){
        return "\nEventID : " + getEventID() +
                "\nName: " + getEventName() +
                "\nDate: " + getDate() +
                "\nTeam 1: " + team1 +
                "\nTeam2: " + team2 + 
                "\nLocation: " + getLocation() +
                "\nPrice: " + getPrice();
                //Overriding toString() method for SportEvents 
    } 
}
    


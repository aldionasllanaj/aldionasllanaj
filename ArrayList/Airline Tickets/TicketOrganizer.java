import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;
    
    public TicketOrganizer (ArrayList <AirlineTicket> ticket){
        tickets = ticket;
    }
    public ArrayList <AirlineTicket> getTickets(){
        return tickets;
    }
    
    public void printPassengersByBoardingGroup (){
       for (int i = 1 ; i <=5 ; i++){
            System.out.println("Boarding Group " + i + ":");
        for (int j =0;j < tickets.size(); j++){
            if(tickets.get(j).getBoardingGroup() == i){
                System.out.println(tickets.get(j).getName());
            }
        }
       }
    }
    
    public void canBoardTogether(){
        boolean bo = false;
        for (int i =0;i < tickets.size() -1 ;i++){
            if(tickets.get(i).getRow() == tickets.get(i+1).getRow() && tickets.get(i).getBoardingGroup() == tickets.get(i+1).getBoardingGroup()){
                System.out.println(tickets.get(i).getName() + " can board with " + tickets.get(i+1).getName() + ".");
                bo = true;
            }}
            if (!bo) 
            {
                System.out.println("There are no passengers with the same row and boarding group.");
            }
    }
    
}
import java.util.ArrayList;

public class RoadTrip
{
    
    ArrayList <GeoLocation>  list = new ArrayList<GeoLocation>();
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude){
        GeoLocation obj1 = new GeoLocation(name,latitude,longitude);
        list.add(obj1);
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops(){
        return list.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength(){
        double total = 0;
        for(int i=1;i<list.size();i++){
            total += list.get(i).distanceFrom(list.get(i-1));
        }
        return total;
    }
    
    // Return a formatted toString of the trip
    public String toString(){
        String p = "";
        for (int i = 0;i<list.size();i++){
            
            p += i+1 +". " + list.get(i).getName() + " (" + list.get(i).getLatitude() + ", " + list.get(i).getLongitude() + ")\n" ;
    }
        return p;
    }
}
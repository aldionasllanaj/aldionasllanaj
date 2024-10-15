import java.util.ArrayList;

public class DataPurge {
    
    public static void removeDuplicates(ArrayList<String> arr) {
        for (int i = 0;i < arr.size() ;i++) {
            String name = arr.get(i);
            for (int j = i + 1 ; j < arr.size(); j++){
            if (name.equals(arr.get(j))) {
                System.out.println(name);
                arr.remove(j);
            }
            }
        }
        
     
    }
    
    public static void removeName(ArrayList<String> arr, String name) {
        for (int i = 0 ; i< arr.size() ; i++){
            if (arr.get(i).contains(name)) {
                System.out.println("Removed: " + arr.get(i));
                arr.remove(i);
                i--;
            }
        }
    }
    
    public static boolean correctlyFormatted(ArrayList<String> arr) {
        for (int i = 0 ; i < arr.size(); i++) {
            String[] name = arr.get(i).split(" ");
            if (name.length != 2) {
                return false;
            }
            String firstName = name[0].substring(0, 1);
            String lastName = name[1].substring(0, 1);
            if (!firstName.equals(firstName.toUpperCase())) {
                return false;
            }
            if (!lastName.equals(lastName.toUpperCase())){
                return false;
            }
        }
        return true;
    }
}
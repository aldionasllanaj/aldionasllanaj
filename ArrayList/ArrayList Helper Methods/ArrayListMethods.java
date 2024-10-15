import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print (ArrayList<Double> arr){
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static void condense (ArrayList<Double> arr){
        for(int i=0;i<arr.size();i+=2){
            arr.set(i+1, arr.get(i)*arr.get(i+1));
        }
        for(int i=0;i<arr.size();i++){
            arr.remove(i);
        }
    }
    public static void duplicate (ArrayList<Double> arr){
        int arr1 = arr.size(); 
        for(int i=0;i<arr1;i++){
            arr.add(arr.get(i));
        }
    }
    
}
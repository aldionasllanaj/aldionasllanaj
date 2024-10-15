public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here
    public Dog (String fName, String bred, boolean shots){
        name = fName;
        breed = bred;
        hasShots = shots;
    }
    public Dog(String fName, String bred){
        name = fName;
        breed = bred;
        hasShots = false;
    }
    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }
        
        return output;
    }
}
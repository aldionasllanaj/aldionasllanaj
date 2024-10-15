public class Routine
{
    private double school;
    private double sleep;
    private double friends;
    private double hobbies;
    
    public Routine (){
        school = 0;
        hobbies = 0;
        friends = 0;
        sleep = 0;
    }
    
    public double getSchool(){
        return school;
    }
    public double getHobbies(){
        return hobbies;
    }
    public double getFriends(){
        return friends;
    }
    public double getSleep(){
        return sleep;
    }
    
    public void setSchool(double newSchool){
        school = newSchool;
    }
    public void setHobbies(double newHobbies){
        hobbies = newHobbies;
    }
    public void setFriends(double newFriends){
        friends = newFriends;
    }
    public void setSleep(double newSleep){
        sleep = newSleep;
    }
    
    public void printTotal(){
        double schoolWeek = (school * 7);
        double hobbiesWeek = (hobbies * 7);
        double friendsWeek = (friends * 7);
        double sleepWeek = (sleep * 7);
        double total = schoolWeek + hobbiesWeek + friendsWeek + sleepWeek;
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + schoolWeek);
        System.out.println("Sleeping: " + sleepWeek);
        System.out.println("With Friends: " + friendsWeek);
        System.out.println("Doing fun stuff: " + hobbiesWeek);
        System.out.println("You're busy " + total + " hours a week!");
    }
    
}
public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon (int lev , String attac){
        level = lev;
        attack = attac;
    }
    // Put getters here
    public String getAttack (){
        return attack;
    }
    public int getLevel (){
        return level;
    }
    // Put other methods here
    public String fight(){
        String r = "";
        for (int i = 0; i < level; i++)
        {
            r += attack;
        }
        return r;
    }
    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}
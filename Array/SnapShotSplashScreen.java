public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String [] splash = {"Welcome","to", "the snap shot", "app!"};
        for(int i=0;i<splash.length; i++){
            System.out.println(splash[i]);
        }
        splash [0] = "Upgrade";
        System.out.println();
        splash [splash.length-1] = "premium app!";for(int i=0;i<splash.length; i++){
            System.out.println(splash[i]);
        }
        
    }
}
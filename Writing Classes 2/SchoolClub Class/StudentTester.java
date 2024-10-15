public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        SchoolClub alan1 = new SchoolClub (alan,"Group 1");
        SchoolClub ada1 = new SchoolClub (ada,"Group 2");
        
        System.out.println(alan);
        System.out.println(ada);
        System.out.println(alan1);
        
    }
}
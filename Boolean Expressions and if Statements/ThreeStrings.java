import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";
        //Asking the user for their password and companyCode
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your password:");
        String pass = input.nextLine();
        System.out.println("Enter the company's secret code: ");
        String company = input.nextLine();
        
        String compCode = new String (pass + companyCode);
        String userCode= new String (pass + company);
        
        if (compCode.equals(userCode)){
            System.out.println("Access granted");
        }else{
            System.out.println(userCode + " is denied");
        }
    }
}
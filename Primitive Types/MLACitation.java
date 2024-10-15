import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        // Start here!
        String author, title, publisher;
        int year;
        Scanner input = new Scanner ( System.in);
        System.out.println("Enter the author's name as 'Last name, First name': ");
        author = input.nextLine();
        System.out.println("Enter the year the book was published: ");
        year = input.nextInt();
        input.nextLine();
        System.out.println("Enter the title of the book: ");
        title = input.nextLine();
        System.out.println("Enter the publisher of the book: ");
        publisher = input.nextLine();
        
        System.out.print(author);
        System.out.print(". " );
        System.out.print(title);
        System.out.println(".");
        System.out.print(publisher);
        System.out.print(", ");
        System.out.print(year);
        System.out.println(".");
    }
}
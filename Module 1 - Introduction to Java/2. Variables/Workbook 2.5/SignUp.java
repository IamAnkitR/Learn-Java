import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        
        
        //Task 1 - Using Scanner, ask the user questions
        System.out.println("What's your first name?");
        String fname = scan.nextLine();
        System.out.println("\nWhat's your last name?");
        String lName = scan.nextLine();
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("\nSelect an username");
        String uName = scan.nextLine();
        System.out.println("\nWhich city do you live?");
        String city = scan.nextLine();
        System.out.println("\nWhat country that's from?");
        String country = scan.nextLine();
        //Ask for their first name.
        //Ask for their last name.
        //Ask: how old are you?
        //Ask them to make a username.
        //Ask what city they live in.
        //Ask what country that's from.


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram! Your information is shown below");
        System.out.println("\nFirst Name: "+fname +"\nLast name: "+ lName + "\nAge: "+ age + "\nUsername: "+ uName + "\nCity: "+ city + "\nCountry: "+ country);

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}
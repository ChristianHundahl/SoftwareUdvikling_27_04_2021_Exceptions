package NemId;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        while (true) {
            NemIdAuthorizer cpr = new NemIdAuthorizer();
            Scanner input = new Scanner(System.in);
            FileReader readThis = new FileReader();
            System.out.println("Please input cpr and password:");
            try {
                System.out.println(cpr.isValidInput(input.nextLine(), input.nextLine()));
                //Call isValidUser (see exercise 2)
                System.out.println("Input cpr and password to search for user:");
                readThis.isValidUser(input.nextLine(), input.nextLine());
                break;
            }
            catch (WrongCprException | NoSuchUserException e) {
                System.out.println(e.getMessage());
            }
        }
        //Exercise 2
        //Write a data source for NemIdAuthorizer. The data source is a .csv file with
        //2 columns: Username & Password. Expand the program such that a custom
        //exception "NoSuchUserException" is thrown, if a certain user does not exist.
        //See TestData
        //See class NoSuchUserException
    }
}
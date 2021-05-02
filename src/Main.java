import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = {"hej"};
        //System.out.println(array[2]); //Throws an Exception: Index 2 out of bounds for length 1
        //firstMethod(); //Main does not handle Exception --> program crashes
        System.out.println("Please input cpr: ");

        try {
            Scanner sc = new Scanner(System.in);
            cprValidator cpr = new cprValidator();
            System.out.println(cpr.validateCpr(sc.nextLine()));
        }
        catch(InputMismatchException e) { //Executes code in 'Catch block' if Exception e encountered
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }

    public void firstMethod() throws Exception { //Throws responsibility for Exception to Main
        secondMethod();
    }

    public void secondMethod() throws Exception { //Throws responsibility for Exception to firstMethod
        throw new Exception();
    }

    public static class cprValidator {
        public boolean validateCpr(String cpr) {
            if (cpr.length() != 10) {
                throw new InputMismatchException();
            }
        return true;
        }
    }
}
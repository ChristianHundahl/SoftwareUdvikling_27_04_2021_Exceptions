package NemId;

import java.util.InputMismatchException;

public class WrongPasswordException extends InputMismatchException {
    WrongPasswordException(){
        super("Password must contain between 8 and 12 characters. Please try again");
    }
}

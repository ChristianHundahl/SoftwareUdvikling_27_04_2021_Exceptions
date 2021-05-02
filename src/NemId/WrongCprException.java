package NemId;
import java.util.InputMismatchException;

public class WrongCprException extends InputMismatchException {
    WrongCprException(){
        super("Wrong CPR input, please try again.");
    }
}

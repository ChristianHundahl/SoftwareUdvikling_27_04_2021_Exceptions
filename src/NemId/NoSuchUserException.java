package NemId;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class NoSuchUserException extends FileNotFoundException {
    NoSuchUserException(){
        super("There is no such user");
    }
}

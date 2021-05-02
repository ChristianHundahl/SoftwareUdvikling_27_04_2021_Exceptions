package NemId;
import java.util.InputMismatchException;

public class NemIdAuthorizer {
    private String cpr;
    private String password;

    public boolean isValidInput(String cpr, String password) {
        if (cpr.length() != 10) {
            throw new WrongCprException();
        }

        return true;
    }
}

package NemId;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public FileReader(){
    }
    public boolean isValidUser(String cpr, String password) throws FileNotFoundException {
        Scanner readThisFile = new Scanner(new File("src/TestData"));
        while (readThisFile.hasNextLine()){
            String line = readThisFile.nextLine();
            String[] lineAsArray = line.split(";");
            if (lineAsArray[0].equals(cpr)){
                System.out.println("User found");
                return true;
            }
        }
        throw new NoSuchUserException();
    }
}

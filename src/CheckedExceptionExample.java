import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) throws FileNotFoundException { //throws in this case not solving root issue - responsibility shifted, if throwing exception from Main program crashes
        Scanner sc = new Scanner(System.in);
        String fileLocation = sc.nextLine();
        File f = new File(sc.nextLine());
        Scanner FileScanner = new Scanner(sc.nextLine());
    }
}

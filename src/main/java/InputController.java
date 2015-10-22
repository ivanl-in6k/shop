import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by ivan on 22.10.15.
 */
public class InputController {

    Scanner scanner;
    InputStream input;
    Printer printer;

    public InputController(InputStream inputStream, Printer printer) {
        input = inputStream;
        scanner = new Scanner(input);
        this.printer = printer;
    }
    public void setPointFromUser(){
        for (;;) {
            printer.printPointsOfMenu();
            int numberOfPoint = scanner.nextInt();
            printer.printChoose(numberOfPoint);
            printer.printOfProvider();
            int numberOfProvider = scanner.nextInt();
            printer.printQuestionForNumberOfProvider(numberOfProvider);

        }
    }


}

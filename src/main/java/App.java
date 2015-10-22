/**
 * Created by ivan on 22.10.15.
 */
public class App {

    public static void main(String[] s) {
        ChainStore chainStore = new ChainStore();
        chainStore.createDataBase();
        Printer printer = new Printer(chainStore);
        printer.printTitle();
        InputController inputData = new InputController(System.in, printer);
        inputData.setPointFromUser();

    }
}

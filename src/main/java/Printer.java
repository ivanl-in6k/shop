import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 21.10.15.
 */
public class Printer {
    ChainStore chainStore;

    Printer(ChainStore chainStore){
        this.chainStore = chainStore;
    }
    private int providerNumber = 0;

    public void printTitle() {
        System.out.println("Store 1.0 | Menu");
        System.out.println("==================");
    }

    public void printPointsOfMenu() {
        System.out.println("1 - Print sum of products by same provider");
        System.out.println("2 - Store that has the largest amount of sales by provider");
        System.out.println("3 - Print table");

    }

    public void printQuestionForNumberOfProvider(int providerNumber) {
        System.out.println("Input number of Provider : ");
        this.providerNumber = providerNumber;
    }

    public void printChoose(int numberOfPoint) {
        if(numberOfPoint == 1) {
           System.out.println("Print sum of products by same provider: " + chainStore.getPricesAmountBy(chainStore.providers.get(providerNumber)));
        } else if(numberOfPoint == 2) {
            System.out.println("Shop that has the largest sales by Provider : " + chainStore.getStoreWithLargestAmountOfSales(chainStore.providers.get(0)));
        }
    }

    public void printOfProvider() {
        List<Provider> providers = chainStore.providers;
        System.out.println("Providers: ");
        int i = 0;
        for(Provider provider : providers){
            System.out.println((i++)+ " " + provider.getFirstName());
        }
    }

    public void printTable() {

    }
}

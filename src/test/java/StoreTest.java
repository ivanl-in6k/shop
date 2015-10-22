import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by ivan on 22.10.15.
 */
public class StoreTest {
    List<ProductSet> productSets = new ArrayList<>();
    List<Provider> providers = new ArrayList<>();

    private String name = "First Store";
    private int number = 1001;

    @Before
    public void createListOfProviders () {
        providers.add(new Provider("Tom", "Daniels"));
        providers.add(new Provider("Alex", "O'Niel"));
        providers.add(new Provider("Loran", "Blan"));
        providers.add(new Provider("Sergey", "Romanovsky"));

        productSets.add(new ProductSet(new Product("Candy", "Very good sweets", providers.get(0)), new ProductBill(100, 15.10)));
        productSets.add(new ProductSet(new Product("Candy RGB", "Very good sweets", providers.get(1)), new ProductBill(400, 17.10)));
        productSets.add(new ProductSet(new Product("Candy NP", "Very good sweets", providers.get(2)), new ProductBill(200, 12.10)));
    }

    @Before
    public void testCreateListOfProductSets () {

    }

    @Test
    public void testCreateStore(){
        Store store = new Store (number, name, productSets.subList(0, 1));
        assertThat(store.getName(), is(name));
        assertThat(store.getNumber(), is(number));
    }

}

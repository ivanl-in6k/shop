import java.util.*;

/**
 * Created by ivan on 21.10.15.
 */
public class ChainStore {
    private List<Store> stores = new ArrayList<>();
    List<Buyer> buyers = new ArrayList<>();
    List<Provider> providers = new ArrayList<>();
    List<ProductSet> productSets = new ArrayList<>();
    List<Order> orders = new ArrayList<>();

//    ChainStore() {
//        createDataBase();
//    }
    public void add(Store store) {
        stores.add(store);
    }

    public double getPricesAmountBy(Provider provider) {
        int amount = 0;
        for(Store store : stores) {
            for (ProductSet productSet : store.getProductSets()) {
                amount += productSet.isProvider(provider) ? productSet.getPriceForSet() : 0;
            }
        }
        return amount;
    }


    public Store getStoreWithLargestAmountOfSales(Provider provider){
        Map<Store, Double> sales = new HashMap<>();
        List<Order> orders = new ArrayList<>();
        for(Order order : orders) {
            for (ProductSet productSet : order.getStore().getProductSets()) {
                sales.put(order.getStore(), productSet.isProvider(provider) ? productSet.getPriceForSet() : 0);
            }
        }
        double max = 0;
        Store storeWithMax = null;
        for(Store store : sales.keySet()){
            if(max < sales.get(store)) {
                max = sales.get(store);
                storeWithMax = store;
            }
        }

        return storeWithMax;
    }

    public void createDataBase() {
        createProviders();
        createBuyers();
        createProducts();
        createStores();
        createOrders();

    }

    private void createStores() {
        stores.add(new Store(1010, "New-K-Market", productSets.subList(0, 1)));
        stores.add(new Store(1011, "i-Market", productSets.subList(0, 2)));
        stores.add(new Store (1011, "Elite-Market", productSets.subList(0, 3)));
    }

    private void createOrders() {
        orders.add(new Order(stores.get(0), productSets.subList(0, 1), buyers.get(0)));
        orders.add(new Order(stores.get(1), productSets.subList(0, 2), buyers.get(1)));
        orders.add(new Order(stores.get(0), productSets.subList(0, 1), buyers.get(2)));
    }

    private void createBuyers() {
        buyers.add(new Buyer("Jack", "Oliver"));
        buyers.add(new Buyer("Lara", "Valeska"));
        buyers.add(new Buyer("Sara", "Goldman"));
        buyers.add(new Buyer("Alla", "Petresky"));
    }

    private void createProducts() {
        productSets.add(new ProductSet(new Product("Candy", "Very good sweets", providers.get(0)), new ProductBill(100, 15.10)));
        productSets.add(new ProductSet(new Product("Candy RGB", "Very good sweets", providers.get(1)), new ProductBill(400, 17.10)));
        productSets.add(new ProductSet(new Product("Candy NP", "Very good sweets", providers.get(2)), new ProductBill(200, 12.10)));
        productSets.add(new ProductSet(new Product("Sugar", "Very good sugar", providers.get(1)), new ProductBill(200, 5.10)));
    }

    private void createProviders() {
        providers.add(new Provider("Tom", "Daniels"));
        providers.add(new Provider("Alex", "O'Niel"));
        providers.add(new Provider("Loran", "Blan"));
        providers.add(new Provider("Sergey", "Romanovsky"));
    }
}

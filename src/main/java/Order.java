import java.util.List;

/**
 * Created by ivan on 21.10.15.
 */
public class Order {
    private Store store;
    private Buyer buyer;
    private List<ProductSet> productSets;

    public Order(Store store, List<ProductSet> productSets, Buyer buyer) {
        this.store = store;
        this.productSets = productSets;
        this.buyer = buyer;
    }

    public Order(Store store, ProductSet productSet, Buyer buyer) {
        this.store = store;
        this.productSets.add(productSet);
        this.buyer = buyer;
    }
    public void setProductSets(List<ProductSet> productSets) {
        this.productSets = productSets;
    }

    public List<ProductSet> getProductSets() {
        return productSets;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Store getStore() {
        return store;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}

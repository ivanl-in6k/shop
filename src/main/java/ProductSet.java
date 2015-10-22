/**
 * Created by ivan on 22.10.15.
 */
public class ProductSet {
    private ProductBill bill;
    private Product product;

    public ProductSet(Product product, ProductBill productBill) {
        this.bill = productBill;
        this.product = product;
    }

    public Provider getProvider() {
        return product.getProvider();
    }

    public boolean isProvider(Provider provider) {
        if(getProvider().equals(provider))
            return true;
        return false;
    }

    public double getPriceForSet() {
        return bill.getPrice() * bill.getCount();
    }

    public double getPriceOfOneProduct() {
        return bill.getPrice();
    }

    public double  getCountOfSet() {
        return bill.getCount();
    }

    public ProductBill getBill() {
        return bill;
    }

    public void setBill(ProductBill bill) {
        this.bill = bill;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

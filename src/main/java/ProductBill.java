/**
 * Created by ivan on 22.10.15.
 */
public class ProductBill {
    private int count;
    private double price;

    public ProductBill(int count, double price) {
        this.count = count;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

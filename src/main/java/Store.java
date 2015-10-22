import java.util.List;

/**
 * Created by ivan on 21.10.15.
 */
public class Store {
    private String name;
    private int number;
    private List<ProductSet> productSets;

    public Store(int number, String name, List<ProductSet> productSets) {
        this.name = name;
        this.number = number;
        this.productSets = productSets;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<ProductSet> getProductSets() {
        return productSets;
    }

    public void setProductSets(List<ProductSet> productSets) {
        this.productSets = productSets;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
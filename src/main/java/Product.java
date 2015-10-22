/**
 * Created by ivan on 21.10.15.
 */
public class Product {
    private String name;
    private String description;
    private Provider provider;

    public Product(String name, String description, Provider provider) {
        this.name = name;
        this.description = description;
        this.provider = provider;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

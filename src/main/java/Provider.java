/**
 * Created by ivan on 21.10.15.
 */
public class Provider {
    private String firstName;
    private String lastName;

    public Provider(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Provider)) return false;

        Provider provider = (Provider) o;

        if (!firstName.equals(provider.firstName)) return false;
        if (!lastName.equals(provider.lastName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

}

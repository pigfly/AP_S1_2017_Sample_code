package au.com.microsoft.sale;

/**
 * Created by alexj on 9/3/17.
 */
public abstract class Sale implements SaleProtocol {
    private String address;

    public Sale(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public abstract double computeCharge();
}

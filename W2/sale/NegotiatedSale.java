package au.com.microsoft.sale;

/**
 * Created by alexj on 9/3/17.
 */
public class NegotiatedSale extends Sale {
    private double commRate;
    private double salePrice;

    public NegotiatedSale(String address, double commRate, double salePrice) {
        super(address);
        this.commRate = commRate;
        this.salePrice = salePrice;
    }

    @Override
    public double computeCharge() {
        return salePrice * commRate;
    }
}

package au.com.microsoft.sale;

/**
 * Created by alexj on 9/3/17.
 */
public class AuctionSale extends Sale {
    private double basePrice;
    private double actualPrice;
    private double bonusRate;

    public AuctionSale(String address, double basePrice, double actualPrice, double bonusRate) {
        super(address);
        this.basePrice = basePrice;
        this.actualPrice = actualPrice;
        this.bonusRate = bonusRate;
    }

    @Override
    public double computeCharge() {
        return 2000 + (actualPrice - basePrice) * bonusRate;
    }
}

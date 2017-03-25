package au.edu.rmit.carDealer;

/**
 * Created by alexj on 16/3/17.
 */
public class Wagon extends Car {
    private double length;

    public Wagon(int maxSpeed, double regularPrice, String color, double length) {
        super(maxSpeed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        double originalSalePrice = super.getRegularPrice();
        return length < 5.0 ? 0.95 * originalSalePrice : 0.9 * originalSalePrice;
    }
}

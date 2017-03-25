package au.edu.rmit.carDealer;

/**
 * Created by alexj on 16/3/17.
 */
public class FordCar extends Car {
    private int year;
    private double manufacturerDiscount;

    public FordCar(int maxSpeed, double regularPrice, String color, int year, double manufacturerDiscount) {
        super(maxSpeed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        double originalSalePrice = super.getSalePrice();
        return year > 1 ? originalSalePrice * 0.97 : originalSalePrice * manufacturerDiscount;
    }

    @Override
    public String toString() {
        return String.format("Price for Car Type %s is %f", getClass(), getSalePrice());
    }
}

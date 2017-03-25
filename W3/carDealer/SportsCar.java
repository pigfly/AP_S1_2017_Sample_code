package au.edu.rmit.carDealer;

/**
 * Created by alexj on 16/3/17.
 */
public class SportsCar extends Car {
    private int horsePower;

    public SportsCar(int maxSpeed, double regularPrice, String color, int horsePower) {
        super(maxSpeed, regularPrice, color);
        this.horsePower = horsePower;
    }

    @Override
    public double getSalePrice() {
        double originalPrice = getRegularPrice();
        return horsePower > 400 ?  0.95 * originalPrice : 0.9 * originalPrice;
    }
}

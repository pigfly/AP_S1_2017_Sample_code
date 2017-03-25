package au.edu.rmit.carDealer;

/**
 * Created by alexj on 16/3/17.
 */
public abstract class Car implements CarProtocol {
    private int maxSpeed;
    private double regularPrice;
    private String color;

    public Car(int maxSpeed, double regularPrice, String color) {
        this.maxSpeed = maxSpeed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    @Override
    public double getSalePrice() {
        return 0.96 * regularPrice;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
}

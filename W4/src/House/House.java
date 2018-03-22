package House;

/**
 * Created by alexj on 23/3/17.
 */
public class House implements HouseProtocol {
    private String address;
    private double price;

    public House(String address, double price) {
        this.address = address;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void paint() {
        System.out.format("Painting a %s \n", getClass());
    }
}

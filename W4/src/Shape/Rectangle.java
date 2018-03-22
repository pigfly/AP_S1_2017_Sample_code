package Shape;

/**
 * Created by alexj on 23/3/17.
 */
public class Rectangle implements ShapeProtocol {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("%s with width %.2f and height %.2f ", getClass(), width, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void paint() {
        System.out.format("Painting a %s \n", getClass());
    }
}

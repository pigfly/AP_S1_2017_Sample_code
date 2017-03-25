package au.com.microsoft.panel;

/**
 * Created by alexj on 9/3/17.
 */
public class RectanglePanel extends Panel {
    private double width;
    private double height;

    public RectanglePanel(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCost() {
        return width * height * getAreaRate() + 2 * (width + height) * getEdgeRate();
    }

    @Override
    public double getEdgeRate() {
        return 0.5;
    }

    @Override
    public double getAreaRate() {
        return 0.5;
    }
}

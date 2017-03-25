package au.com.microsoft.panel;

import java.util.stream.DoubleStream;

/**
 * Created by alexj on 9/3/17.
 */
public class TrianglePanel extends Panel {
    private double s1Cost;
    private double s2Cost;
    private double s3Cost;

    public TrianglePanel(double s1Cost, double s2Cost, double s3Cost) {
        this.s1Cost = s1Cost;
        this.s2Cost = s2Cost;
        this.s3Cost = s3Cost;
    }

    @Override
    public double getCost() {
        double sSum = DoubleStream.of(s1Cost, s2Cost, s3Cost).sum();
        double avgSCost = sSum / 2.0;
        double avgSMeanSquare = avgSCost * (s1Cost -avgSCost) * (s2Cost -avgSCost) * (s3Cost - avgSCost);

        return Math.sqrt(avgSCost) * getAreaRate() + sSum * getEdgeRate();
    }

    @Override
    public double getEdgeRate() {
        return 0.15;
    }

    @Override
    public double getAreaRate() {
        return 0.2;
    }
}

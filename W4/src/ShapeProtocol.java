package au.com.rmit.misc;

/**
 * Created by alexj on 23/3/17.
 */
public interface ShapeProtocol extends Paintable {
    double getArea();

    // https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
    default void paint() {
        System.out.format("Painting a Shape of %s", getClass());
    }
}

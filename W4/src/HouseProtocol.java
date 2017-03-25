package au.com.rmit.misc;

/**
 * Created by alexj on 23/3/17.
 */
public interface HouseProtocol extends Paintable {
    default void paint() {
        System.out.format("Painting a %s", getClass());
    }
}

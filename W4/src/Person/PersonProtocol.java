package Person;

import Shape.*;

/**
 * Created by alexj on 23/3/17.
 */
public interface PersonProtocol extends Paintable {
    Boolean hasParent();

    default void paint() {
        System.out.format("Painting a %s", getClass());
    }
}

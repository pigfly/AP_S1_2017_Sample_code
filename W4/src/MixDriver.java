import Shape.*;
import Person.*;
import House.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by alexj on 23/3/17.
 */
public class MixDriver {
    public static void main(String[] args) {
        Child child = new Child("jack", 10, null, null);
        House house = new House("melbourne city", 700000.5);
        Rectangle rectangle = new Rectangle(1.2, 2.4);

        ArrayList<Paintable> objs = new ArrayList<Paintable>();
        objs.addAll(Arrays.asList(child, house, rectangle));

        for (Paintable obj: objs) {
            obj.paint();
        }

    }
}

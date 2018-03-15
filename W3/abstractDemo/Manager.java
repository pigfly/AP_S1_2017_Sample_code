package abstractDemo;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static List<Human> list;

    static {
        Bob bob = new Bob("b");
        Susan susan = new Susan("s");
        list = new ArrayList<Human>();
        list.add(bob);
        list.add(susan);
    }

    public static Human get(String type) {
        for (Human item: list) {
            if (item.isSupported(type)) {
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Human h = get("s");
        h.action2();
    }
}

package abstractDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class Human {
    private final Set<String> types;

    public Human(String type) {
        System.out.println("Abstract Human Class Constructor get called");
        this.types = new HashSet<>(Arrays.asList(type));
    }

    protected boolean isSupported(String type) {
        return types.contains(type);
    }

    protected void actionAll() {
        action1();
        action2();
        action3();
    }

    public void action1() {

    }

    public abstract void action2();

    public void action3() {
        System.out.println("this is Abstract Human Class action 3");
    }
}

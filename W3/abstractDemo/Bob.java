package abstractDemo;

public class Bob extends Human {

    public Bob(String type) {
        super(type);
    }

    @Override
    public void action2() {
        System.out.println("Bob is doing action 2");
    }

    @Override
    public String toString() {
        return super.toString() + "Bob";
    }
}

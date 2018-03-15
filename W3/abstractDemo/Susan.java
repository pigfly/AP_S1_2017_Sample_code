package abstractDemo;

public class Susan extends Human {
    public Susan(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return super.toString() + " Susan";
    }

    @Override
    public void action2() {
        System.out.println("This is Susan doing action 2");
    }
}

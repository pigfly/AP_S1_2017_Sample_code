package au.edu.rmit.carDealer;

/**
 * Created by alexj on 16/3/17.
 */
public class MyAutoShop {

    private static MyAutoShop instance = new MyAutoShop();

    public static MyAutoShop getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Wagon wagon1 = new Wagon(20, 20000.5, "black", 1.5);
        FordCar ford1 = new FordCar(50, 30000.1, "red", 2, 0.98);
        FordCar ford2 = new FordCar(50, 30020.1, "blue", 1, 0.98);

        System.out.format("Price for Car Type %s named %s is %.2f \n", wagon1.getClass(), "wagon1", wagon1.getSalePrice());
        System.out.format("Price for Car Type %s named %s is %.2f \n", ford1.getClass(), "ford1", ford1.getSalePrice());
        System.out.format("Price for Car Type %s named %s is %.2f \n", ford2.getClass(), "ford2", ford2.getSalePrice());
    }
}

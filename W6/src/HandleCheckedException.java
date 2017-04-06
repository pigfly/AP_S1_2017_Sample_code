package au.edu.rmit.week6;

/**
 * Created by alexj on 6/4/17.
 */
public class HandleCheckedException {
    public static void main(String[] args) {

        String welcome = "Week6!";
        char[] chars = welcome.toCharArray();

        try {
            String sub = welcome.substring(10);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}

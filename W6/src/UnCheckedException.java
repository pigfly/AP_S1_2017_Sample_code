package au.edu.rmit.week6;

/**
 * Created by alexj on 6/4/17.
 */
public class UnCheckedException {
    public static void main(String[] args) {

        String welcome = "Wee6!";
        char[] chars = welcome.toCharArray();

        if (chars.length > 10) {
            throw (new RuntimeException("too many chars..."));
        }
    }
}

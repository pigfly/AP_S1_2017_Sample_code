import java.util.concurrent.*;

public class Ozzz {
    public Ozzz(double t) { // Seconds
        try {
            TimeUnit.MILLISECONDS.sleep((int)(1000 * t));
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public Ozzz(double t, String msg) {
        this(t);
        System.out.println(msg);
    }
}
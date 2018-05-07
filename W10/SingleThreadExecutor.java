import java.util.concurrent.*;
import java.util.stream.*;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec =
                Executors.newSingleThreadExecutor();
        IntStream.range(0, 10)
                .mapToObj(OzzzTask::new)
                .forEach(exec::execute);
        System.out.println("All tasks submitted");
        exec.shutdown();
        while(!exec.isTerminated()) {
            System.out.println(
                    Thread.currentThread().getName() +
                            " awaiting termination");
            new Ozzz(0.1);
        }
    }
}

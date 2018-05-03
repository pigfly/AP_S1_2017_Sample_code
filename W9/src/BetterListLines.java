import java.io.IOException;
import java.nio.file.*;

public class BetterListLines {
    public static void
    main(String[] args) throws Exception {
        // process as incoming stream
        try {
            Files.lines(Paths.get("W9/src/ListLines.java"))
                    .skip(3)
                    .map(String::toLowerCase)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
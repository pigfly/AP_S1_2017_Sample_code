import java.util.*;
import java.nio.file.*;

public class Write {
    static Random rand = new Random(47);
    static final int SIZE = 1000;
    public static void
    main(String[] args) throws Exception {
        // Write bytes to a file:
        byte[] bytes = new byte[SIZE];
        rand.nextBytes(bytes);
        Files.write(Paths.get("writeData.dat"), bytes);
        System.out.println("writeData.dat: " +
                Files.size(Paths.get("writeData.dat")));

        // Write an iterable to a file:
        List<String> lines = Files.readAllLines(
                Paths.get("writeData.dat"));
        Files.write(Paths.get("writeData.txt"), lines);
        System.out.println("writeData.txt: " +
                Files.size(Paths.get("writeData.txt")));
    }
}
import java.util.*;
import java.nio.file.*;

public class ListLines {
    public static void
    main(String[] args) throws Exception {
        Path p = Paths.get("?? fill in the blank here ??").toAbsolutePath();
        Files.readAllLines(p)
                .stream()
                .filter(line -> !line.startsWith("//"))
                .map(line ->
                        line.substring(0, line.length()/2))
                .forEach(System.out::println);
    }
}
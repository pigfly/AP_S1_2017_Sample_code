import java.util.*;

public class JCFIntoStream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("foo1", "bar2", "baz3", "lalala4", "qiaomenzhuan5");
        strings.forEach(System.out::println);
        // Convert to a Stream for many more options:
        String result = strings.stream()
                .map(String::toUpperCase)
                .map(s -> s.substring(2))
                .reduce(":", (s1, s2) -> s1 + s2);
        System.out.println(result);
    }
}

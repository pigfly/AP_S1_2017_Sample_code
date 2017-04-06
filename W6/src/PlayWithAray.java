package au.edu.rmit.week6;

import java.util.*;

/**
 * Created by alexj on 5/4/17.
 */
public class PlayWithAray {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");

        // OLD Way...
        Iterator<String> listIterator = stringList.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // New Way...
        for (String value: stringList) {
            System.out.println(value);
        }

        // Only in Java 8
        stringList.forEach(System.out::println);
    }
}

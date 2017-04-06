package au.edu.rmit.week6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexj on 6/4/17.
 */
public class PlayWithHashMap {
    public static void main(String[] args) {

        Map<String, String> mapExample = new HashMap<>();

        mapExample.put("A", "a");
        mapExample.put("B", "b");
        mapExample.put("C", "c");

        for (Map.Entry<String, String> entry : mapExample.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key);
            System.out.println(value);
        }
        for (String key : mapExample.keySet()) {
        }

        for (Object value : mapExample.values()) {

        }
    }
}

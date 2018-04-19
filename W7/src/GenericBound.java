import java.util.*;

public class GenericBound {
    public static void print(Collection<? extends Number> c){
        for(Number n:c) {
            System.out.println(n);
        }
    }
    public static void print1(Collection<? super Number> s){
        for(Object s1:s) {
            System.out.println(s1);
        }
    }

    public static <T> boolean guess1(Collection<T> collection){
        return collection == null || collection.isEmpty();
    }

    public static <K,V> boolean guess2(Map<K,V> map){
        return map == null || map.isEmpty();
    }

    public static void main(String[] args){
        Collection<Object> c1 = new ArrayList<>();
        Collection<Number> c2 = new HashSet<>();
        Collection<String> c3 = new LinkedHashSet<>();

        System.out.println(guess1(c1));

        print(c2); // ?
        print(c3); // ?
        print1(c1); // ?
        print1(c2); // ?
    }


}
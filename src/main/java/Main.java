import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("apple", 20);
        map.put("peach", 25);
        map.put("orange", 40);
        map.put("banana", 39);
        map.putIfAbsent("peach",25);
        System.out.println(map.keySet());
        List list = List.of(1,2,3,4,5,6);
        System.out.println(list);

    }
}

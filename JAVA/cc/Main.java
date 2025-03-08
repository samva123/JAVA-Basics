import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 85);
        map.put("Bob", 75);
        map.put("Charlie", 95);

        // Sorting HashMap by values
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((e1, e2) -> e1.getValue() - e2.getValue());

        System.out.println("Sorted HashMap by values:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

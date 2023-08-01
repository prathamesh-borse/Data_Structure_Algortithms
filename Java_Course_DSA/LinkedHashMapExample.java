import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String key1 = scan.next();
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put(key1, "Value1");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getValue());
        }
    }
}

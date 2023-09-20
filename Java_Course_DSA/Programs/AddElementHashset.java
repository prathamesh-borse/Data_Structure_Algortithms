package Java_Course_DSA.Programs;

import java.util.HashSet;

public class AddElementHashset {
    public static void main(String[] args) {
        Hashet();
    }

    public static void Hashet() {
        HashSet<String> set = new HashSet<String>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");

        for (String name : set) {
            System.out.println(name);
        }
    }
}

import java.util.LinkedList;

public class GetFirstElementLinkedList {
    public static void main(String[] args) {
        LinkedList();
    }

    public static void LinkedList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}

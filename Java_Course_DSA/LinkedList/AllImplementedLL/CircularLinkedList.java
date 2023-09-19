package Java_Course_DSA.LinkedList.AllImplementedLL;

public class CircularLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static Node insertNode(Node tail, int element, int d) {

        // empty list
        if (tail == null) {
            Node newNode = new Node(d);
            tail = newNode;
            newNode.next = newNode;
        } else {
            // non-empty list
            // assuming that the element is present in the list
            Node curr = tail;
            while (curr.data != element) {
                curr = curr.next;
            }

            // element is found -> curr representing the element wala node
            Node temp = new Node(d);
            temp.next = curr.next;
            curr.next = temp;

        }
        return tail;
    }

    static Node deleteNode(Node tail, int value) {

        // empty list
        if (tail == null) {
            System.out.print("list is empty, please check again.!");
        } else {
            // non-empty

            // assuming that "value" is present in the linked list
            Node prev = tail;
            Node curr = prev.next;

            while (curr.data != value) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr.next;
            // 1 Node Linked List
            if (curr == prev) {
                tail = null;
            }

            // below >= 2 Node Linked List
            else if (tail == curr) {
                tail = prev;
            }
            curr.next = null;
        }
        return tail;
    }

    static void displayLL(Node tail) {
        if (tail == null) {
            System.out.print("list is empty check again.!");
        } else {
            Node temp = tail;
            do {
                System.out.print(tail.data + " ");
                tail = tail.next;
            } while (tail != temp);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Node tail = null;

        // empty list insert
        tail = insertNode(tail, 5, 3);
        displayLL(tail);

        tail = insertNode(tail, 3, 5);
        displayLL(tail);
/*
        tail = insertNode(tail, 5, 7);
        displayLL(tail);

        tail = insertNode(tail, 7, 9);
        displayLL(tail);

        tail = insertNode(tail, 5, 6);
        displayLL(tail);

        tail = insertNode(tail, 9, 10);
        displayLL(tail);

        tail = insertNode(tail, 3, 4);
        displayLL(tail);
*/
        tail = deleteNode(tail, 5);
        displayLL(tail);

    }
}

package Java_Course_DSA.LinkedList.AllImplementedLL.Questions;

// reverse doubly linked list

public class ReverseLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node head = node1;

        head = insertNode(head, 20);
        displayLL(head);

        head = insertAtTail(head, 30);
        displayLL(head);

//        head = reverseLinkedList(head);
//        displayLL(head);

        head = reverse1(head);
        displayLL(head);

    }

    static void displayLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node insertNode(Node head, int d) {
        Node temp = new Node(d);
        temp.next = head;
        return temp; // returning new head that is assigning to list
    }

    static Node insertAtTail(Node head, int d) {
        Node temp = new Node(d);

        // checking if the list is initially empty or not and assigning it to the new Node
        if (head == null) {
            head = temp;
        } else {
            // Otherwise, traverse to the end of the list and add the new node there
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }

        // and returning the new Head
        return head;
    }

    static Node reverseRecursion(Node curr, Node prev) {
        //base case
        if (curr == null) {
            return prev;
        }

        Node forward = curr.next;
        curr.next = prev;
        return reverseRecursion(forward, curr);
    }

    static Node reverse1(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node chotaHead = reverse1(head.next);
        head.next.next = head;
        head.next = null;
        return chotaHead;
    }

    static Node reverseLinkedList(Node head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        Node prev = null;
//        Node curr = head;
//        Node forward = null;
//
//        while (curr != null) {
//            forward = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = forward;
//        }
//        return prev;

//        Node curr = head;
        Node prev = null;
        head = reverseRecursion(head, prev);
        return head;

    }
}

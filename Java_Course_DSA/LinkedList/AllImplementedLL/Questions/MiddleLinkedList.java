package Java_Course_DSA.LinkedList.AllImplementedLL.Questions;

public class MiddleLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node head = node;

//        head = insertAtHead(head, 2);
//        displayLL(head);
//
//        head = insertAtHead(head, 3);
//        displayLL(head);

        head = insertAtTail(head, 2);
        displayLL(head);

        head = insertAtTail(head, 3);
        displayLL(head);

        head = insertAtTail(head, 4);
        displayLL(head);

        head = insertAtTail(head, 5);
        displayLL(head);

        head = middleNode(head);
        displayLL(head);

    }

    public static void displayLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        return newNode;
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

    static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }


    // approach 1: Iterative way
    static Node middleNode(Node head) {
//        int length = getLength(head);
//        int ans = (length / 2);
//
//        Node temp = head;
//        int cnt = 0;
//        while (cnt < ans) {
//            temp = temp.next;
//            cnt++;
//        }
//        return temp;

        return getMiddle(head);
    }

    // approach 2:
    static Node getMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        if (head.next.next == null) {
            return head.next;
        }

        Node fast = head.next;
        Node slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            slow = slow.next;
        }
        return slow;
    }


}

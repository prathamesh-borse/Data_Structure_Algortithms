package Java_Course_DSA.LinkedList.AllImplementedLL;

public class DoublyLinkedList {

    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private static Node tail = null;

    static void displayLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static int getLength(Node head) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    static Node insertAtHead(Node head, int d) {

        Node newNode = new Node(d);
        newNode.next = head;
        if (head != null) {
            // create new node
            // assign its next to head
//            newNode.next = head;
            // assign head prev to new node
            head.prev = newNode;
            // change the position of the head
        }

        head = newNode;
        if (tail == null) {
            tail = newNode;
        }

        // return the new head
        return head;
    }

    static Node insertAtTail(Node head, int d) {
        Node newNode = new Node(d);

        // if the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // head pointer
            Node current = head;

            // traversing till we find if current head is not null, if null is found insert the new node with it
            while (current.next != null) {
                current = current.next;
            }

            // assign new node to the current head
            tail.next = newNode;
            // assigning new node prev to the current means head
            newNode.prev = tail;
            tail = newNode;
        }
        return head;
    }

    static Node insertAtPosition(Node head, int position, int d) {
        // edge case if we want to insert element at the first position
        if (position == 1) {
            // here we are returning the new head which are assigned to the first node
            head = insertAtHead(head, d);
            // returning the result with head and tail
            return head;
        }

        // assigning temp to head
        Node temp = head;

        // variable cnt to check we are in which position
        int cnt = 1;

        // here we are traverse till n - 1 position where we have to insert the node
        while (cnt < position - 1) {
            // traverse the head to the position
            temp = temp.next;
            // incrementing the cnt
            cnt++;
        }

        // inserting at last position
        if (temp.next == null) {
            head = insertAtTail(head, d);
        } else {
            // creating a node for d
            Node nodeToInsert = new Node(d);
            // assigning newNode next to previous node next
            nodeToInsert.next = temp.next;
            // assigning previous next to new Node

            temp.next.prev = nodeToInsert;
            temp.next = nodeToInsert;
            nodeToInsert.prev = temp;
        }
        return head; // Return the original head, not the modified head
    }

    static Node deleteNode(int position, Node head) {

        // deleting node at first position
        if (position == 1) {
            Node temp = head;
            temp.next.prev = null;
            head = temp.next;
            temp.next = null;

        } else {

            // deleting node middle or last position
            Node curr = head;
            Node prev = head;

            int cnt = 1;
            while (cnt < position) {
                prev = curr;
                curr = curr.next;
                cnt++;
            }

            // Update the previous node's next pointer to skip the current node
            curr.prev = null;
            if (curr.next == null) {
                tail = prev;
            }
            prev.next = curr.next;
            curr.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        Node head = null;
        displayLL(head);

//        System.out.println("Length of the LL is: " + getLength(head));

        head = insertAtHead(head, 11);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + tail.data);

        head = insertAtHead(head, 13);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + tail.data);

        head = insertAtHead(head, 8);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + tail.data);

        head = insertAtTail(head, 25);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + tail.data);

        head = insertAtPosition(head, 2, 100);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + tail.data);

        head = insertAtPosition(head, 1, 101);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + tail.data);

        head = insertAtPosition(head, 7, 102);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + tail.data);

        head = deleteNode(7, head);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + tail.data);

    }
}

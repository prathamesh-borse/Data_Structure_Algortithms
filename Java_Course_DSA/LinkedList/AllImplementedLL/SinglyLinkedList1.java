package Java_Course_DSA.LinkedList.AllImplementedLL;

/*
    LinkedList = is a linear data structure
                 which is collection of nodes.
                 & node is a combination of data and next address of node.
*/

public class SinglyLinkedList1 {
    public static void main(String[] args) {
        // created a new node
        Node node1 = new Node(10);

//        System.out.println("Node Data: " + node1.data);
//        System.out.println("Next Node Value: " + node1.next);

        // node1 pointing to head
        Node head = node1;

//        System.out.println("Printing the first Node");
        displayLL(head);

//        head = insertAtHead(head, 12); // Update the head with the new head returned by insertAtHead
//        displayLL(head);

//        head = insertAtHead(head, 15);
//        displayLL(head);

        // tail pointing to head
//        Node head = node1;
//        displayLL(head);

//        System.out.println("Inserting the node at the end and printing it with head");
        head = insertAtTail(head, 12);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + head.tail.data);

//        System.out.println("Inserting the node at the end and printing it with head");
        head = insertAtTail(head, 15);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + head.tail.data);


        // inserting node at the specific position
//        System.out.println("Inserting the node at the specific position and printing it with head");
        head = insertAtMiddle(head, 4, 22);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + head.tail.data);

        // deleting the node
        head = deleteNode(4, head);
        displayLL(head);
        System.out.println("head: " + head.data);
        System.out.println("tail: " + head.tail.data);
    }

    static Node insertAtHead(Node head, int d) {
        Node temp = new Node(d);
        temp.next = head;
        return temp; // returning new head that is assigning to list
    }

    static Node insertAtMiddle(Node head, int position, int d) {

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

        if (temp.next == null) {
            head = insertAtTail(head, d);
        } else {
            // creating a node for d
            Node nodeToInsert = new Node(d);
            // assigning newNode next to previous node next
            nodeToInsert.next = temp.next;
            // assigning previous next to new Node
            temp.next = nodeToInsert;
        }
        return head; // Return the original head, not the modified head
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
            head.tail = temp;
        }

        // and returning the new Head
        return head;
    }

    static Node deleteNode(int position, Node head) {

        // deleting node at first position
        if (position == 1) {
            head = head.next;
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
            if (curr.next == null) {
                head.tail = prev;
            }
            prev.next = curr.next;
            curr.next = null;
        }
        return head;
    }

    // displaying Linked List
    static void displayLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node {
        int data;
        Node next;
        Node tail;

        // every time when you create new node object it will ask for values inside the constructor
        Node(int x) {
            this.data = x;
            this.next = null;
            this.tail = this;
        }
    }
}

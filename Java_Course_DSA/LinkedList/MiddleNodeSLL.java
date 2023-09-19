package Java_Course_DSA.LinkedList;

public class MiddleNodeSLL {
    public static void main(String[] args) {
        ListNode newNode = new ListNode();
        newNode.insert(1);
        newNode.insert(2);
        newNode.insert(3);
        newNode.insert(4);
        newNode.insert(5);

        Node middleNode = ListNode.middleNode(newNode.head);
        System.out.println("Middle Node: " + middleNode.value);

        newNode.display();
    }

    public static class ListNode {
        Node head;

        public ListNode() {
            this.head = null;
        }

        void insert(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }


        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }

        void deleteNode(Node node) {
            Node newNode = node.next;
            node.value = newNode.value;
            node.next = newNode.next;
            newNode.next = null;
        }

        static Node middleNode(Node head) {
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    public static class Node {
        int value;
        Node next;

        public Node(int val) {
            this.value = val;
            this.next = null;
        }
    }
}

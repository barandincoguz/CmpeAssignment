public class SinglyLinkedList {
    private Node head;
    private Node tail;

    // Inner Node class
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void delete(int value) {
        if (isEmpty()) {
            System.out.println("List is empty. Cannot delete from an empty list.");
            return;
        }

        // Check if the value to delete is in the head
        if (head.data == value) {
            head = head.next;
            if (head == null) {
                tail = null; // If the list becomes empty after deletion
            }
            System.out.println("Deleted: " + value);
            return;
        }

        // Search for the node to delete
        Node current = head;
        Node previous = null;
        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        // If the node to delete is found
        if (current != null) {
            previous.next = current.next;
            if (current == tail) {
                tail = previous; // Update tail if the last node is deleted
            }
            System.out.println("Deleted: " + value);
        } else {
            System.out.println("Value not found in the list.");
        }
    }


    public boolean isEmpty() {
        return head == null;
    }

}

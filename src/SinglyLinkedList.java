import java.util.Random;

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

    private int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;  // Key found
            }
            current = current.next;
        }
        return false;  // Key not found
    }

    public void deleteRandomNodes(int count) {
        if (count >= size()) {
            // If count is greater than or equal to the size of the list, delete all nodes
            head = null;
            tail = null;
        } else {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                // Generate a random index to delete a node
                int randomIndex = random.nextInt(size() - 1);
                deleteNodeAtIndex(randomIndex);
            }
        }
    }

    private void deleteNodeAtIndex(int index) {
        if (index < 0 || index >= size()) {
            // Invalid index
            return;
        }

        if (index == 0) {
            // If deleting the head, move the head to the next node
            head = head.next;
            if (head == null) {
                // If the list becomes empty, update the tail to null
                tail = null;
            }
        } else {
            // Traverse to the node before the one to be deleted
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            // Update the next reference to skip the node to be deleted
            current.next = current.next.next;

            // If the deleted node was the tail, update the tail
            if (current.next == null) {
                tail = current;
            }
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

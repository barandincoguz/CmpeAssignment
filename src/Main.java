import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //BST(10000);
        //BST(100000);
        //BST(1000000);
        //BST(10000000);
        //BST(100000000);
        //AVL(10000);
        //AVL(100000);
        //AVL(1000000);
        //AVL(10000000);
        //AVL(100000000);
        //DeleteRandomMembersFromBST1000000(10000);
        //DeleteRandomMembersFromBST1000000(100000);
        //DeleteRandomMembersFromAVL1000000(10000);
        //DeleteRandomMembersFromAVL1000000(100000);
        //LinkedList(10000);
        //LinkedList(100000);
        //LinkedList(1000000);
        //LinkedList(10000000);
        //LinkedList(100000000);
        //DeleteRandomMembersFromLinkedList1000000(10000);
        //DeleteRandomMembersFromLinkedList1000000(100000);


    }

    public static void AVL(int count) {
        AVLTree avlTree = new AVLTree();
        Random random = new Random();
        long startTime, endTime;

        //Insert random numbers into AVL Tree
        int min = -1000000000;
        int max = 1000000000;

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            avlTree.insert(randomNumber);
        }

        //Search for specific numbers in AVL Tree and measure execution time
        startTime = System.nanoTime();
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = avlTree.search(numberToSearch);
        endTime = System.nanoTime();
        System.out.println("AVL Tree: \n Number " + numberToSearch + " found: " + found + ". Execution time: " + (endTime - startTime) + " ns");
    }


    public static void BST(int count) {
        BinarySearchTree bst1 = new BinarySearchTree();
        Random random = new Random();
        // Generate and insert random numbers into the BST
        int min = -1000000000;
        int max = 1000000000;
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            bst1.insert(randomNumber);
        }
        long start = System.nanoTime();
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = bst1.search(numberToSearch);
        System.out.println("Number " + numberToSearch + " found: " + found);
        long finish = System.nanoTime();
        long time = finish - start;
        System.out.println(time + " ns ");
    }

    public static void LinkedList(int size) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        Random random = new Random();

        int min = -1000000000;
        int max = 1000000000;

        // Insert random numbers into the linked list
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            linkedList.insertAtEnd(randomNumber);
        }
        long startTime = System.nanoTime();
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean isFound = linkedList.search(numberToSearch);
        long endTime = System.nanoTime();
        System.out.println("LinkedList: \n Number " + numberToSearch + " found: " + isFound + ". Execution time: " + (endTime - startTime) + " ns");
    }

    public static void DeleteRandomMembersFromBST1000000(int count) {
        BinarySearchTree bst = new BinarySearchTree();
        Random random = new Random();
        // Generate and insert random numbers into the BST
        int min = -1000000000;
        int max = 1000000000;
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            bst.insert(randomNumber);
        }
        long startTimeBST = System.nanoTime();
        bst.deleteRandomNodes(count);
        long endTimeBST = System.nanoTime();
        System.out.println("BST Deletion Execution Time: " + (endTimeBST - startTimeBST) + " ns");
    }

    public static void DeleteRandomMembersFromAVL1000000(int count) {
        AVLTree avlTree = new AVLTree();
        Random random = new Random();
        // Generate and insert random numbers into the BST
        int min = -1000000000;
        int max = 1000000000;
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            avlTree.insert(randomNumber);
        }
        long startTimeAVL = System.nanoTime();
        avlTree.deleteRandomNodes(count);
        long endTimeAVL = System.nanoTime();
        System.out.println("AVL Tree Deletion Execution Time: " + (endTimeAVL - startTimeAVL) + " ns");
    }


    public static void DeleteRandomMembersFromLinkedList1000000(int count) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        Random random = new Random();
        // Generate and insert random numbers into the BST
        int min = -1000000000;
        int max = 1000000000;
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            linkedList.insertAtEnd(randomNumber);
        }
        long startTime = System.nanoTime();
        linkedList.deleteRandomNodes(count);
        long endTime = System.nanoTime();
        System.out.println("Linked List Deletion Execution Time: " + (endTime - startTime) + " ns");

    }
}

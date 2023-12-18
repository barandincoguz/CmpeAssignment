import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //BST10000();
        //BST100000();
        //BST1000000();
        //BST10000000();
        //BST100000000();
        //AVL10000();
        //AVL100000();
        //AVL1000000();
        //AVL10000000();
        //AVL100000000();
    }

    public static void AVL10000() {
        AVLTree avlTree = new AVLTree();
        Random random = new Random();
        long startTime, endTime;
        startTime = System.currentTimeMillis();

        // Task 1: Insert random numbers into AVL Tree
        int min = -1000000000;
        int max = 1000000000;

        for (int i = 0; i < 10000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            avlTree.insert(randomNumber);
        }

        // Task 2: Search for specific numbers in AVL Tree and measure execution time
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = avlTree.search(numberToSearch);
        endTime = System.currentTimeMillis();
        System.out.println("AVL Tree: \n Number " + numberToSearch + " found: " + found + ". Execution time: " + (endTime - startTime) + " ms");
    }

    public static void AVL100000() {
        AVLTree avlTree = new AVLTree();
        Random random = new Random();
        long startTime, endTime;
        startTime = System.currentTimeMillis();

        // Task 1: Insert random numbers into AVL Tree
        int min = -1000000000;
        int max = 1000000000;

        for (int i = 0; i < 100000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            avlTree.insert(randomNumber);
        }

        // Task 2: Search for specific numbers in AVL Tree and measure execution time
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = avlTree.search(numberToSearch);
        endTime = System.currentTimeMillis();
        System.out.println("AVL Tree: \n Number " + numberToSearch + " found: " + found + ". Execution time: " + (endTime - startTime) + " ms");
    }

    public static void AVL1000000() {
        AVLTree avlTree = new AVLTree();
        Random random = new Random();
        long startTime, endTime;
        startTime = System.currentTimeMillis();

        // Task 1: Insert random numbers into AVL Tree
        int min = -1000000000;
        int max = 1000000000;

        for (int i = 0; i < 1000000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            avlTree.insert(randomNumber);
        }

        // Task 2: Search for specific numbers in AVL Tree and measure execution time
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = avlTree.search(numberToSearch);
        endTime = System.currentTimeMillis();
        System.out.println("AVL Tree: \n Number " + numberToSearch + " found: " + found + ". Execution time: " + (endTime - startTime) + " ms");
    }

    public static void AVL10000000() {
        AVLTree avlTree = new AVLTree();
        Random random = new Random();
        long startTime, endTime;
        startTime = System.currentTimeMillis();

        // Task 1: Insert random numbers into AVL Tree
        int min = -1000000000;
        int max = 1000000000;

        for (int i = 0; i < 10000000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            avlTree.insert(randomNumber);
        }

        // Task 2: Search for specific numbers in AVL Tree and measure execution time
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = avlTree.search(numberToSearch);
        endTime = System.currentTimeMillis();
        System.out.println("AVL Tree: \n Number " + numberToSearch + " found: " + found + ". Execution time: " + (endTime - startTime) + " ms");
    }

    public static void AVL100000000() {
        AVLTree avlTree = new AVLTree();
        Random random = new Random();
        long startTime, endTime;
        startTime = System.currentTimeMillis();

        // Task 1: Insert random numbers into AVL Tree
        int min = -1000000000;
        int max = 1000000000;

        for (int i = 0; i < 100000000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            avlTree.insert(randomNumber);
        }

        // Task 2: Search for specific numbers in AVL Tree and measure execution time
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = avlTree.search(numberToSearch);
        endTime = System.currentTimeMillis();
        System.out.println("AVL Tree: \n Number " + numberToSearch + " found: " + found + ". Execution time: " + (endTime - startTime) + " ms");
    }

    public static void BST10000() {
        long start = System.currentTimeMillis();
        BinarySearchTree bst1 = new BinarySearchTree();
        Random random = new Random();
        // Generate and insert random numbers into the BST
        int min = -1000000000;
        int max = 1000000000;
        for (int i = 0; i < 10000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            bst1.insert(randomNumber);
        }
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = bst1.search(numberToSearch);
        System.out.println("Number " + numberToSearch + " found: " + found);
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println(time + " ms ");
    }

    public static void BST100000() {
        long start = System.currentTimeMillis();
        BinarySearchTree bst1 = new BinarySearchTree();
        Random random = new Random();
        // Generate and insert random numbers into the BST
        int min = -1000000000;
        int max = 1000000000;
        for (int i = 0; i < 100000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            bst1.insert(randomNumber);
        }
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = bst1.search(numberToSearch);
        System.out.println("Number " + numberToSearch + " found: " + found);
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println(time + " ms ");
    }

    public static void BST1000000() {
        long start = System.currentTimeMillis();
        BinarySearchTree bst1 = new BinarySearchTree();
        Random random = new Random();
        // Generate and insert random numbers into the BST
        int min = -1000000000;
        int max = 1000000000;
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            bst1.insert(randomNumber);
        }
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = bst1.search(numberToSearch);
        System.out.println("Number " + numberToSearch + " found: " + found);
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println(time + " ms ");
    }

    public static void BST10000000() {
        long start = System.currentTimeMillis();
        BinarySearchTree bst1 = new BinarySearchTree();
        Random random = new Random();
        // Generate and insert random numbers into the BST
        int min = -1000000000;
        int max = 1000000000;
        for (int i = 0; i < 10000000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            bst1.insert(randomNumber);
        }
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = bst1.search(numberToSearch);
        System.out.println("Number " + numberToSearch + " found: " + found);
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println(time + " ms ");
    }

    public static void BST100000000() {
        long start = System.currentTimeMillis();
        BinarySearchTree bst1 = new BinarySearchTree();
        Random random = new Random();
        // Generate and insert random numbers into the BST
        int min = -1000000000;
        int max = 1000000000;
        for (int i = 0; i < 100000000; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            bst1.insert(randomNumber);
        }
        int numberToSearch = random.nextInt((max - min) + 1) + min;
        boolean found = bst1.search(numberToSearch);
        System.out.println("Number " + numberToSearch + " found: " + found);
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println(time + " ms ");
    }

}

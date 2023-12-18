public class AVLTree {
    Node1 root;

    AVLTree() {
        root = null;
    }

    int height(Node1 node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int getBalance(Node1 node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    Node1 rightRotate(Node1 y) {
        Node1 x = y.left;
        Node1 T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node1 leftRotate(Node1 x) {
        Node1 y = x.right;
        Node1 T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node1 insertRec(Node1 node, int key) {
        if (node == null) {
            return new Node1(key);
        }

        if (key < node.key) {
            node.left = insertRec(node.left, key);
        } else if (key > node.key) {
            node.right = insertRec(node.right, key);
        } else {
            return node; // Duplicate keys are not allowed
        }

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node1 root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }

        if (key < root.key) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }

    void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(Node1 root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.key + " ");
            inOrderRec(root.right);
        }
    }

}

package task10;

public class Tree {

    Node root;

    Tree(int value) {
        root = new Node(value);
    }

    public void add(int value) {
        addRecursive(root, value);
    }

    private Node addRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = addRecursive(node.left, value);

        } else if (value > node.value) {
            node.right = addRecursive(node.right, value);
        }
        return node;
    }

    public void print() {
        printRecursive(this.root);
    }

    private void printRecursive(Node node) {
        if (node.left != null) {
            printRecursive(node.left);
        }
        System.out.println(node.value);
        if (node.right != null) {
            printRecursive(node.right);
        }
    }
}

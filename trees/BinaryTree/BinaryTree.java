import java.util.Scanner;

/**
 * binaryTree
 */
public class BinaryTree {

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.right = right;
            this.left = left;
        }
    }

    private Node root;

    public int size;

    public BinaryTree() {
        Scanner s = new Scanner(System.in);
        this.root = this.takeInput(s, null, false);
    }

    private Node takeInput(Scanner s, Node parent, boolean isleft) {
        if (parent == null) {
            System.out.println("Enter data for root Node: ");
        } else {
            if (isleft) {
                System.out.println("Enter Left Child of " + parent.data);
            } else {
                System.out.println("Enter Right Child of " + parent.data);
            }
        }

        int data = s.nextInt();
        Node node = new Node(data, null, null);
        this.size++;

        System.out.println("Do you have Left Child of " + node.data);
        boolean choice = s.nextBoolean();
        if (choice) {
            node.left = this.takeInput(s, node, true);
        }
        System.out.println("Do you have Right Child of " + node.data);
        choice = s.nextBoolean();
        if (choice) {
            node.right = this.takeInput(s, node, false);
        }

        return node;
    }

    public void display() {
        this.display(this.root);
    }

    private void display(Node node) {
        if (node.left != null) {
            System.out.print(node.left.data + " => ");
        } else
            System.out.print("End => ");

        System.out.print(node.data);

        if (node.right != null) {
            System.out.print(" <= " + node.right.data);
        } else
            System.out.print(" <= End ");

        System.out.println();

        if (node.left != null) {
            this.display(node.left);
        }
        if (node.right != null) {
            this.display(node.right);
        }
    }

    public int size() {
        return this.size(this.root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }

        int Lsize = this.size(node.left);
        int Rsize = this.size(node.right);

        return Lsize + Rsize + 1;
    }

    public int height() {
        return this.height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }

        int Lheight = this.height(node.left);
        int Rheight = this.height(node.right);

        return Math.max(Lheight, Rheight) + 1;
    }

    public int max() {
        return this.max(this.root);
    }

    private int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int Lmax = this.max(node.left);
        int Rmax = this.max(node.right);

        return Math.max(node.data, Math.max(Lmax, Rmax));
    }

    public int min() {
        return this.min(this.root);
    }

    private int min(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        int Lmin = this.min(node.left);
        int Rmin = this.min(node.right);

        return Math.min(node.data, Math.min(Lmin, Rmin));
    }

    public boolean isPresent(int data) {
        return this.isPresent(this.root, data);
    }

    private boolean isPresent(Node node, int data) {
        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        } else if (isPresent(node.left, data)) {
            return true;
        } else if (isPresent(node.right, data)) {
            return true;
        } else
            return false;
    }

    public void preOrder() {
        this.preOrder(this.root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        this.preOrder(node.left);
        this.preOrder(node.right);
    }

    public void inOrder() {
        this.inOrder(this.root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }

        this.inOrder(node.left);
        System.out.print(node.data + " ");
        this.inOrder(node.right);
    }

    public void postOrder() {
        this.postOrder(this.root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void mirror() {
        this.mirror(this.root);
    }

    private void mirror(Node node) {
        if (node == null) {
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        this.mirror(node.left);
        this.mirror(node.right);
    }

    public void rootToLeaf() {
        this.rootToLeaf(this.root, "");
    }

    private void rootToLeaf(Node node, String osf) {
        if (node == null) {
            return;
        }
        osf = osf + node.data + ", ";
        if (node.left == null && node.right == null) {
            System.out.println(osf + "END");
            return;
        }

        rootToLeaf(node.left, osf);
        rootToLeaf(node.right, osf);
    }

    public boolean isBST() {
        return this.isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data < min || node.data > max) {
            return false;
        } else if (!this.isBST(node.left, min, node.data)) {
            return false;
        } else if (!this.isBST(node.right, node.data, max)) {
            return false;
        } else
            return true;
    }

}
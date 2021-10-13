public class BSTClient {

    public static void main(String[] args) {

        BST bst = new BST();

        bst.add(50);
        bst.add(25);
        bst.add(75);
        bst.add(12);
        bst.add(37);
        bst.add(62);
        bst.add(87);
        bst.add(30);
        bst.add(72);

        bst.display();

        bst.RootToLeaf();

        System.out.println(bst.max());
        System.out.println(bst.min());

        bst.remove(50);

        bst.display();
    }

}

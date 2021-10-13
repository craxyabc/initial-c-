public class BTClient {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.display();

        System.out.println(bt.size());

        System.out.println(bt.height());

        System.out.println(bt.max());

        System.out.println(bt.min());

        System.out.println(bt.isPresent(10));

        bt.preOrder();

        System.out.println();

        bt.inOrder();

        System.out.println();

        bt.postOrder();

        System.out.println();

        bt.mirror();
        bt.display();

        bt.rootToLeaf();

        System.out.println(bt.isBST());
    }
}

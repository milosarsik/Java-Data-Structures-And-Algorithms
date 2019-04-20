public class Main
{
    public static void main(String[] args)
    {

        LinkedBinaryTree<Integer> myTree = new LinkedBinaryTree<>();

        myTree.addRoot(1);

        System.out.println(myTree.root().getElement());

        Position<Integer> position = myTree.root();
        System.out.println(position.getElement());

        myTree.addLeft(position, 2);

        myTree.addRight(position, 10);

        position = myTree.left(position);
        System.out.println(position.getElement());

        position = myTree.root();
        position = myTree.right(position);

        System.out.println(position.getElement());

    }
}

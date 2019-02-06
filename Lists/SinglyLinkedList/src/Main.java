public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();

        myList.addFirst(10);
        myList.addFirst(9);
        myList.addFirst(8);
        myList.addFirst(7);
        myList.addFirst(6);
        myList.addFirst(5);
        myList.addFirst(4);
        myList.addFirst(3);
        myList.addFirst(2);
        myList.addFirst(1);

        for(int i = 0; i < 10; i++)
        {
            System.out.println(myList.first());
            myList.removeFirst();
        }
    }
}

public class LinkedStack<E> implements Stack<E>
{
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    // default constructor
    public LinkedStack()
    {
    }

    // access methods
    public int size()
    {
        return list.size();
    }

    public boolean empty()
    {
        return list.isEmpty();
    }

    public E peek()
    {
        return list.first();
    }

    // update methods
    public void push(E e)
    {
        list.addFirst(e);
    }

    public E pop()
    {
        return list.removeFirst();
    }
}
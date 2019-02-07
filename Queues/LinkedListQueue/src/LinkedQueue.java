public class LinkedQueue<E> implements Queue<E>
{
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    // constructor
    public LinkedQueue()
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

    public E first()
    {
        return list.first();
    }

    // update methods
    public void enqueue(E element)
    {
        list.addLast(element);
    }

    public E dequeue()
    {
        return list.removeFirst();
    }
}
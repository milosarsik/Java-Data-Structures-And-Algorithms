public class ArrayQueue<E> implements Queue<E>
{
    // instance variables
    private static final int CAPACITY = 1000;
    private E[] data;
    private int f = 0;
    private int sz = 0;

    // constructors
    public ArrayQueue()
    {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity)
    {
        data = (E[]) new Object[capacity];          // safe cast
    }

    // access methods
    public int size()
    {
        return sz;
    }

    public boolean empty()
    {
        return sz == 0;
    }

    public E first()
    {
        if(empty())
        {
            return null;
        }

        return data[f];
    }

    // update methods
    public void enqueue(E e) throws IllegalStateException
    {
        if(sz == data.length)
        {
            throw new IllegalStateException("Queue is full");
        }

        int avail = (f + sz) % data.length;         // using mod arithmetic

        data[avail] = e;

        sz++;
    }

    public E dequeue()
    {
        if(empty())
        {
            return null;
        }

        E returnElement = data[f];

        data[f] = null;

        f = (f + 1) % data.length;

        sz--;

        return returnElement;
    }
}

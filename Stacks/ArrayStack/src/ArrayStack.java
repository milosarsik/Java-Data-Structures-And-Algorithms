public class ArrayStack<E> implements Stack<E>
{
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;

    // constructor with default capacity
    public ArrayStack()
    {
        this(CAPACITY);
    }

    // constructor with given capacity
    public ArrayStack(int capacity)
    {
        data = (E[]) new Object[capacity];
    }

    // access methods
    public int size()
    {
        return (t + 1);
    }

    public boolean empty()
    {
        return t == -1;
    }

    public E peek()
    {
        if(empty())
        {
            return null;
        }

        return data[t];
    }

    // update methods
    public void push(E e) throws IllegalStateException
    {
        if(size() == data.length)
        {
            throw new IllegalStateException("Stack is full");
        }

        data[++t] = e;
    }

    public E pop()
    {
        if(empty())
        {
            return null;
        }

        E returnElement = data[t];

        data[t] = null;

        t--;

        return returnElement;
    }
}
public class SinglyLinkedList<E>
{
    // ---------- nested Node class ----------
    private static class Node<E>
    {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next)
        {
            this.element = element;
            this.next = next;
        }

        public E getElement()
        {
            return element;
        }

        public Node<E> getNext()
        {
            return next;
        }

        public void setNext(Node<E> next)
        {
            this.next = next;
        }
    }
    // ---------- nested Node class ----------

    // instance variables of the SinglyLinkedList class
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    // constructor
    public SinglyLinkedList()
    {
    }

    // access methods
    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public E first()
    {
        if(isEmpty())
        {
            return null;
        }

        return head.getElement();
    }

    public E last()
    {
        if(isEmpty())
        {
            return null;
        }

        return tail.getElement();
    }

    // update methods
    public void addFirst(E e)
    {
        head = new Node<> (e, head);

        if(size == 0)
        {
            tail = head;                                // special case, new node becomes tail also
        }

        size++;
    }

    public void addLast(E e)
    {
        Node<E> newNode = new Node<>(e, null);

        if(isEmpty())
        {
            head = newNode;                             // special case, previously empty list
        }
        else
        {
            tail.setNext(newNode);
        }

        tail = newNode;

        size++;
    }

    public E removeFirst()
    {
        if(isEmpty())
        {
            return null;
        }

        E returnElement = head.getElement();

        head = head.getNext();

        size--;

        if(size == 0)                                   // special case, list is now empty
        {
            tail = null;
        }

        return returnElement;
    }
}

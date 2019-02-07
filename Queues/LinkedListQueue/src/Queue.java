public interface Queue<E>
{
    int size();
    boolean empty();
    void enqueue(E e);
    E first();
    E dequeue();
}
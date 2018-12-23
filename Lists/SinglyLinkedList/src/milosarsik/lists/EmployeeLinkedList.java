package milosarsik.lists;

public class EmployeeLinkedList
{
    private EmployeeNode head;
    private int size;

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    //addToFront - method that adds to the front of the linked list
    public void addToFront(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);

        node.setNext(head);
        head = node;

        size++;
    }

    public EmployeeNode removeFromFront()
    {
        if(isEmpty())
        {
            return null;
        }

        EmployeeNode removedNode = head;

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList()
    {
        EmployeeNode current = head;

        System.out.println("HEAD -> ");

        while(current != null)
        {
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
    }
}

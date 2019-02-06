package milosarsik.lists;

public class EmployeeLinkedList
{
    private EmployeeNode head;
    private int size;

    // getSize - method that will return the size of the linked list
    public int getSize()
    {
        return size;
    }

    // isEmpty - method that will check if the list is empty or not
    public boolean isEmpty()
    {
        return size == 0;
    }

    // addToFront - method that adds to the front of the linked list, the head
    public void addToFront(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);

        node.setNext(head);
        head = node;

        size++;
    }

    // removeFromFront - method that will remove the head of the linked list
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

    // printList - a method that will print all of the objects in the list
    public void printList()
    {
        EmployeeNode current = head;

        System.out.print("HEAD -> ");

        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }
}

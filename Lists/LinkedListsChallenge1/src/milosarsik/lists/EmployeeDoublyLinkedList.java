package milosarsik.lists;

public class EmployeeDoublyLinkedList
{
    private EmployeeNode head;
    private EmployeeNode tail;
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

        if (head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    // addToEnd - method that adds to the end of the linked list, the tail
    public void addToEnd(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    // addBefore - adds to the list before the specified existing employee, this is the challenge
    public boolean addBefore(Employee newEmployee, Employee existingEmployee)
    {
        if(isEmpty())
        {
            return false;
        }

        EmployeeNode newNode = new EmployeeNode(newEmployee);

        EmployeeNode currentNode = head;

        while(currentNode != null && !currentNode.getEmployee().equals(existingEmployee))
        {
            currentNode = currentNode.getNext();
        }

        if(currentNode == null)
        {
            return false;
        }

        newNode.setPrevious(currentNode.getPrevious());
        newNode.setNext(currentNode);

        currentNode.setPrevious(newNode);

        if(head == currentNode)
        {
            head = newNode;
        }
        else
        {
            newNode.getPrevious().setNext(newNode);
        }

        size++;

        return false;
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

    // removeFromEnd - removes the tail of the linked list
    public EmployeeNode removeFromEnd()
    {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;

        removedNode.setPrevious(null);

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
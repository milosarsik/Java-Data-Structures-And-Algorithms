package milosarsik.lists;

public class EmployeeNode
{
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // getNext - just returns the next node
    public EmployeeNode getNext() {
        return next;
    }

    // setNext - sets the next value of the node, the one that it points to next
    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    // getPrevious - gets the previous node of the current node
    public EmployeeNode getPrevious() {
        return previous;
    }

    // setPrevious - sets the previous node that the current points to
    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public String toString()
    {
        return employee.toString();
    }
}
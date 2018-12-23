package milosarsik.lists;

public class Main
{
    public static void main(String[] args)
    {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 123);
        Employee marySmith = new Employee("Mary", "Smith", 123);
        Employee mikeWilson = new Employee("Mike", "Wilson", 123);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());


        list.printList();

        list.removeFromFront();

        System.out.println(list.getSize());
        list.printList();
    }
}

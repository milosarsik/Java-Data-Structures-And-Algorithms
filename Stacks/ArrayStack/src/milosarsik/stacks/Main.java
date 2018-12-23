package milosarsik.stacks;

public class Main
{
    public static void main(String[] args)
    {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Tom", "Jones", 123));

        stack.printStack();

        System.out.println();
        System.out.println(stack.pop());
        System.out.println();

        stack.printStack();
    }
}

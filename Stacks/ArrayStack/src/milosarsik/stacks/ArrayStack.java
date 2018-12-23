package milosarsik.stacks;

import java.util.EmptyStackException;

public class ArrayStack
{
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity)
    {
        stack = new Employee[capacity];
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public int size()
    {
        return top;
    }

    // push - adds an employee to the top of the stack
    public void push(Employee employee)
    {
        if(top == stack.length)
        {
            Employee[] newArray = new Employee[2 * stack.length];

            System.arraycopy(stack,0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    // pop - takes off the employee at the top of the stack
    public Employee pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];

        stack[top] = null;

        return employee;
    }

    // peek - looks at the employee at the top of the stack
    public Employee peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    // printStack - prints the entire stack
    public void printStack()
    {
        for(int i = top - 1; i >= 0; i-- )
        {
            System.out.println(stack[i]);
        }
    }
}

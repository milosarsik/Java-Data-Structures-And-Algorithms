package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Factorial");

        System.out.println(iterativeFactorial(3));

        System.out.println(recursiveFactorial(3));
    }

    // 1! = 0! * 1 = 1
    // 2! = 1! * 2 = 2

    // n! = n * (n - 1)!, this is the recursive formula

    public static int iterativeFactorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }

        int factorial = 1;

        for(int i = 1; i <=num; i++)
        {
            factorial *= i;
        }

        return factorial;
    }

    // This is a call stack, the calls get pushed on the stack, and then get executed
    // recursiveFactorial(0) <- This will return right away because our breaking condition is if the parameter is 0
    // recursiveFactorial(1)
    // recursiveFactorial(2)
    // recursiveFactorial(3)

    public static int recursiveFactorial(int num)
    {
        if(num == 0)                                          // Base case that will end the recursion
        {
            return 1;
        }

        return num * recursiveFactorial(num - 1);       // Recursive call
    }
}

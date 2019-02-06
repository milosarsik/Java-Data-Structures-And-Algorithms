package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Recursion");

        int [] intArray = {1, 2, 3, 4, 5, 6};


    }
    
    // course implementation of the factorial function, recursive and iterative
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
    
    // n! = n * (n - 1)!, this is the recursive formula
      
    // This is a call stack, the calls get pushed on the stack, and then get executed
    // recursiveFactorial(0) <- This will return right away because our breaking condition is if the parameter is 0
    // recursiveFactorial(1)
    // recursiveFactorial(2)
    // recursiveFactorial(3)

    public static int recursiveFactorial(int num)
    {
        if(num == 0)                                          
        {
            return 1;
        }

        return num * recursiveFactorial(num - 1);      
    }
    
    // book implementation of a factorial function (Pg. 191)
    public static int factorial(int n) throws IllegalArgumentException
    {
        if(n < 0)
        {
            throw new IllegalArgumentException();           // argument must be nonnegative
        }
        else if(n == 0)                                     // base case
        {
            return 1;
        }
        else                                                // recursive case
        {
            return n * factorial(n - 1);            
        }
    }
    
    // sum of squares function, implementation #1
    public static int sumofsquaresone(int n, int m)
    {
        if(n == m)
        {
            return n * n;
        }
        else
        {
            return m * m + sumofsquaresone(n, m-1);
        }
    }
    
    // sum of squares function, implementation #2
    public static int sumofsquares(int n, int m)
    {
        if(n == m)
        {
            return n * n;
        }
        else
        {
            return sumofsquares(n, (m + n) / 2) + sumofsquares((m + n), m);     // splitting up the ranges
        }
    }
    
    // reverse an array of integers in place using recursion, the code will be similar for strings 
    public static void reverse(int[] A, int n, int m)
    {
	    if(n == m)
	    {
		    return;		
	    }
	    else if(n > m)
	    {
		    return;
	    }
	    else
	    {
		    int temp = A[n];
		    A[n] = A[m];
		    A[m] = temp;

		    reverse(A, n+1, m - 1);
	    }
    }

    // find the minimum index with recursion
    public int findMinIndex(int[] A, int left, int right)
    {
	    if(left == right)
	    {	
		    return left;
	    }   
	    else
	    {
		    int minL = findMinIndex(A, left, (left + right) / 2);
		    int minR = findMinIndex(A, (left + right) / 2 + 1, right);
		
		    if(A[minL] <= A[minR])
		    {   
			    return minL;	
		    }	
		    else
		    {
			    return minR;
		    }
	    }
    }
}

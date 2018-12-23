package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Sort Algorithm Challenge 2 - implement insertion sort using recursion");

        int[] integerArray = {3,4,23,34,235,23,14,35,-22};

        insertionSort(integerArray, integerArray.length);

        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);
        }
    }

    public static void insertionSort(int[] input, int numItems)
    {
        if(numItems < 2)
        {
            return;
        }

        insertionSort(input, numItems - 1);

        int newElement = input[numItems - 1];

        int i;

        for(i = numItems - 1; i > 0 && input[i - 1] > newElement; i--)
        {
            input[i] = input[i-1];
        }

        input[i] = newElement;
    }
}
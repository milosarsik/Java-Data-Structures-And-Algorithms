package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Selection Sort");

        int[] integerArray = {3,4,23,34,235,23,14,35,234};

        // Selection sort beings, we are keeping track of the end of the sorted partition
        for(int endOfUnsortedPartition = integerArray.length - 1; endOfUnsortedPartition > 0; endOfUnsortedPartition--)
        {
            int indexOfLargest = 0;                                         // Storing the largest index

            for(int i = 1; i <= endOfUnsortedPartition; i++)                // Traversing the array left to right
            {
                if(integerArray[i] > integerArray[indexOfLargest])          // Comparing elements at each index with the largest element
                {
                    indexOfLargest = i;
                }
            }

            swap(integerArray,indexOfLargest,endOfUnsortedPartition);       // Calling swap
        }

        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);                            // Printing the element
        }
    }

    // swap - method that will swap elements at specified indices
    public static void swap(int[] tempArray, int i, int j)
    {
        if(i == j)
        {
            return;
        }

        int temp = tempArray[i];
        tempArray[i] = tempArray[j];
        tempArray[j] = temp;
    }
}

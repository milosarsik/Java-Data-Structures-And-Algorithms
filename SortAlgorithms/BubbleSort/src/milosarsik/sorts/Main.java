package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Bubble Sort");

        int[] integerArray = {6,2,7,8,3,2,7,45,3465,435};

        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);            // Printing the element
        }

        // Bubble sort begins, we are keeping track of the end of the unsorted partition
        for (int endOfUnsortedPartition = integerArray.length - 1; endOfUnsortedPartition > 0; endOfUnsortedPartition--)
        {
            for (int i = 0; i < endOfUnsortedPartition; i++)    // In this loop we are traversing left to right
            {
                if(integerArray[i] > integerArray[i+1])
                {
                    swap(integerArray, i, i+1);         // Calling swap if true
                }
            }
        }

        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);            // Printing the element
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

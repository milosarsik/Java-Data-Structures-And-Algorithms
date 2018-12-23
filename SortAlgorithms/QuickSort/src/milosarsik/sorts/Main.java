package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Quick Sort");

        int[] integerArray = {2,3,12,3242,56343,6,34,-1};

        quickSort(integerArray, 0, integerArray.length);


        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);
        }
    }

    // quickSort - method that will sort the array
    public static void quickSort(int[] input, int start, int end)
    {
        if(end - start < 2)
        {
            return;
        }

        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    // partition - method that will partition the array
    public static int partition(int[] input, int start, int end)
    {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j)
        {
            // NOTE: empty loop body
            while(i < j && input[--j] >= pivot);

            if(i < j)
            {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while(i < j && input[++i] <= pivot);

            if(i < j)
            {
                input[j] = input[i];
            }
        }

        input[j] = pivot;

        return j;
    }
}

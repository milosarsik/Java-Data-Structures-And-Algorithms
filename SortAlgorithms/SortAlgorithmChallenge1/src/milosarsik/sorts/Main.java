package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Sort Algorithm Challenge #1 - modify merge sort to sort in descending order");

        int[] integerArray = {2,3,12,3242,56343,6,34,-1};

        mergeSort(integerArray, 0, integerArray.length);            // Calling merge sort

        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);
        }

    }

    public static void mergeSort(int[] input, int start, int end)
    {
        if (end - start < 2)
        {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end)
    {
        if (input[mid - 1] >= input[mid])                                               // Changed inequality
        {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end)
        {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];         // Changed inequality
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}

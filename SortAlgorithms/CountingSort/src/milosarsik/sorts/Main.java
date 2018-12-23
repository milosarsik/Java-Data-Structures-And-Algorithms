package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Counting Sort");

        int[] integerArray = {1,3,5,2,7,3,4,5,2,9};

        countingSort(integerArray,1,10);

        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);
        }
    }

    // countingSort = method that will sort the array
    public static void countingSort(int[] input, int min, int max)
    {
        int[] countArray = new int[(max - min) + 1];            // Create the array that will keep track of the occurrence of each number

        for(int i = 0; i < input.length; i++)
        {
            countArray[input[i] - min]++;
        }

        int j = 0;                              // Keeps track of where we are in the input array

        for(int i = min; i <= max; i++)
        {
            while(countArray[i - min] > 0)
            {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}

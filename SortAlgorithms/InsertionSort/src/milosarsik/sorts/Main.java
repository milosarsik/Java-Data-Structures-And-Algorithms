package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Insertion Sort");

        int[] integerArray = {3,4,23,34,235,23,14,35,-22};

        // Insertion sort starts here, firstUnsortedIndex saves the index of the element that we will be adding to the unsorted partition
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < integerArray.length; firstUnsortedIndex++)
        {
            int newElement = integerArray[firstUnsortedIndex];                              // Getting the newElement that we will insert into the sorted partition

            int i;                                                                          // Will use this to travers the array from right to left and compare elements

            for(i = firstUnsortedIndex; i > 0 && integerArray[i - 1] > newElement; i--)     // Compares the elements in the sorted partition
            {                                                                               // if the element is greater than the newElement
                integerArray[i] = integerArray[i-1];                                        // we shift that element to the right, we continue to move down
            }                                                                               // the sorted partition and shift the elements right

            integerArray[i] = newElement;                                                   // After all the shifting, when we compare an element that is less than the newElement
        }                                                                                   // we insert the newElement into the position after the smaller element

        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);                            // Printing the element
        }
    }
}

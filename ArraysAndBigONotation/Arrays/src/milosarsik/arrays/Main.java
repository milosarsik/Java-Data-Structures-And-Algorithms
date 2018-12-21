package milosarsik.arrays;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Arrays");

        // Creating an integer array of size 10, arrays are not dynamic, must set size at declaration
        int[] integerArray = new int[10];

        // Using a for loop to assign and print the values of the array
        for (int i = 0; i < integerArray.length; i++)       // .length gets the length of the array
        {
            integerArray[i] = i + 1;                        // Assigning values

            System.out.println(integerArray[i]);            // Printing values 1 to 10
        }

        // Example of finding the index of an element
        System.out.println("5 is at index " + findIndexOf(integerArray, 5));
    }

    // findIndexOf - method to find the index that the specified value is contained at, returns index, or -1 if not found
    public static int findIndexOf(int[] tempArray, int value) {
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
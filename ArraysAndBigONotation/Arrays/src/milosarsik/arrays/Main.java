package milosarsik.arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Arrays");

        // Creating an integer array of size 10, arrays are not dynamic, must set size at declaration
        int[] integerArray = new int[10];

        // Using a for loop to assign and print the values of the array
        for (int i = 0; i < integerArray.length; i++)       // .length gets the length of the array
        {
            integerArray[i] = i + 1;                // Assigning values

            System.out.println(integerArray[i]);    // Printing values 1 to 10
        }
    }
}
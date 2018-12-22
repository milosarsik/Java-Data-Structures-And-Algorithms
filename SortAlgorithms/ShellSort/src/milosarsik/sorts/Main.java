package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Shell Sort");

        int[] integerArray = {2,3,12,3242,56343,6,34,-1};

        // Shell sort begins here, this will halve the gap value every time
        for (int gap = integerArray.length/2; gap > 0; gap /= 2)                // The only difference between this and insertion
        {                                                                       // sort is that we use gap instead of 1 in the loop
            for (int i = gap; i < integerArray.length; i++)
            {
                int newElement = integerArray[i];

                int j = i;

                while(j >= gap && integerArray[j - gap] > newElement)
                {
                    integerArray[j] = integerArray[j - gap];

                    j-= gap;
                }

                integerArray[j] = newElement;
            }
        }

        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);
        }
    }
}

package milosarsik.sorts;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Merge Sort");

        int[] integerArray = {2,3,12,3242,56343,6,34,-1};

        mergeSort(integerArray, 0, integerArray.length);            // Calling merge sort

        for (int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);
        }
    }

    // mergeSort - this is the method that will sort the array, it is recursive
    public static void mergeSort(int[] input, int start, int end)
    {
        if (end - start < 2)
        {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);                       // Splitting the array
        mergeSort(input, mid, end);                         // Splitting the array

        merge(input, start, mid, end);
    }

    // merge -
    public static void merge(int[] input, int start, int mid, int end)
    {
        if (input[mid - 1] <= input[mid])
        {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end)
        {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
    
    // Below is how we did it in class
    public void mergeSort(int[] a, int l, int r)
    {
        if (l < r)
        {
            int m = (l + r) / 2;                        // Calculating the midpoint
            
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);                     // Splitting the array
            
            merge(a, l, m, r);                          // Merging the arrays
        }
    }
    
    public void merge(int[] a, int l, int m, int r)
    {
        int n1 = m - l + 1;             // This is the size of the left sub array
        int n2 = r - m;                 // This is the size of the right sub array 
    
        // Creating temporary arrays
        int[] lA = new int[n1];
        int[] rA = new int[n2];
       
        // Copying into the new array
        for(int i = 0; i < n1; i++)
        {
            lA[i] = a[l + i];
        }
        
        for(int i = 0; i < n2; i++)
        {
            rA[i] = a[m + 1 + i];
        }
        
        int k = 0, j= 0, c = 0;             // Temporary indices
        
        while(k < n1 && j < n2)
        {
            if(lA[k] <= rA[j])
            {
                a[c + l] = lA[k];
                k++;
            }
            else
            {
                a[c + l] = rA[j];
                j++;
            }
            
            c++;
        }
        
        
        while(k < n1)
        {
            a[c + l] = lA[k];
            k++;
            c++;
        }
        
        while(i < n2)
        {
            
        }
    }
}

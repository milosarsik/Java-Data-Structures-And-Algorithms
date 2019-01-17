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

    // course implementation of merge sort
    public static void mergeSort(int[] input, int start, int end)
    {
        if (end - start < 2)
        {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);                       // splitting the array
        mergeSort(input, mid, end);                         // splitting the array

        merge(input, start, mid, end);
    }
    
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
    
    // class implementation of merge sort
    public void mergeSort(int[] a, int l, int r)
    {
        if (l < r)
        {
            int m = (l + r) / 2;                        // calculating the midpoint
            
            mergeSort(a, l, m);                         // splitting the array
            mergeSort(a, m + 1, r);                     // splitting the array
            
            merge(a, l, m, r);                          // merging the arrays
        }
    }
    
    public void merge(int[] a, int l, int m, int r)
    {
        int n1 = m - l + 1;             // this is the size of the left sub array
        int n2 = r - m;                 // this is the size of the right sub array 
    
        // creating temporary arrays
        int[] lA = new int[n1];
        int[] rA = new int[n2];
       
        // copying into the new array
        for(int i = 0; i < n1; i++)
        {
            lA[i] = a[l + i];
        }
        
        for(int i = 0; i < n2; i++)
        {
            rA[i] = a[m + 1 + i];
        }
        
        int k = 0, j= 0, c = 0;             // temporary indices
        
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
            a[c + 1] = rA[j];
            j++;
            c++;
        }
    }
    
    // book implementation of merge sort (array-based)
    public static <K> void merge(K[] S1, K[] S2, K[] S, Comparator<K> comp)
    {
        int i = 0;
        int j = 0;
        
        while(i + j < S.length)
        {
            if(j == S2.length || (i < S1.length && comp.compare(S1[i], S2[i]) < 0))
            {
                S[i + j] = S1[i++];                 // copy ith element of S1 and increment i
            }
            else
            {
                S[i + j] = S2[j++];                 // copy jth element of S2 and increment j
            }
        }
    }
    
    public static <K> void merge(K[] S1, K[] S2, K[] S, Comparator<K> comp)
    {
        int n = S.length;
        
        if(n < 2)
        {
            return;                                 // array is trivially sorted
        }
        
        //divide
        int mid = n/2;
        K[] S1 = Arrays.copyOfRange(S, 0, mid);     // copy of first half
        K[] S2 = Arrays.copyOfRange(S, mid, n);     // copy of second half
        
        //conquer (with recursion)
        mergeSort(S1, comp);                        // sort copy of first half
        mergeSort(S2, comp);                        // sort copy of second half
        
        //merge results
        merge(S1, S2, S, comp);                     // merge sorted halves back into original
    }
    
    // book also contains queue implementation to sort linked lists and a bottom
    // up non recursive merge sort implementation
    
    
    
    
    
}

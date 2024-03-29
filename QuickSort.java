import java.util.Random;

/**
 *
 * @author Meekaeel Mysorewala
 */

public class QuickSort {
    int[] list;
    int n; 
    
    Random r = new Random();
    
    public QuickSort(int x)
    {
       n = x;
       list = new int[n];
    }
  
    
    public void quicksort()
    {
        quicksort(0, n - 1);
    }

    private void quicksort(int begin, int end)
    {
        int temp;
        int pivot = findPivotLocation(begin, end);

        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;

        pivot = end;

        int i = begin,
                j = end - 1;

        boolean iterationCompleted = false;
        while (!iterationCompleted)
        {
            while (list[i] < list[pivot])
                i++;
            while ((j >= 0) && (list[pivot] < list[j]))
                j--;

            if (i < j)
            {
                //swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;

                i++;
                j--;
            } else
                iterationCompleted = true;
        }

        //swap list[i] and list[pivot]
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;

        if (begin < i - 1) quicksort(begin, i - 1);
        if (i + 1 < end) quicksort(i + 1, end);
    }

    /*
     * Computes the pivot
     */
    private int findPivotLocation(int b, int e)
    {
        return (b + e) / 2;
    }
    
    public void fillArray()
    {
        for(int i = 0; i < list.length; i++)
        {
            list[i] = r.nextInt(10);
        }
    }
    
   
    
}

import java.util.Random;

/**
 *
 * @author Meekaeel Mysorewala
 */
public class SelectionSort {
    int[] list;
    int n;
    Random r = new Random();
    
    public SelectionSort(int x)
    {
        n = x;
        list = new int[n];
    }
    public int minimum(int a, int b)
    {
       int min_idx = a;
        for (int j = a+1; j < b; j++)
        {
            if (list[j] < list[min_idx])
            {
                    min_idx = j; 
            }
        }
        return min_idx;
    }
    
    public void swap(int a, int b)
    {
        int min_idx = a;
        int temp = list[min_idx];
            list[min_idx] = list[a];
            list[a] = temp;
    }

    public void selectionsort()
    {
        for (int i = 0; i < list.length - 1; i++)
        {
            int minPos = minimum(i, list.length - 1);
            swap(i, minPos);
        }
    }
    
    public void fillArray()
    {
        for(int i = 0; i < list.length; i++)
        {
            list[i] = r.nextInt(10);
        }
    }
    
}

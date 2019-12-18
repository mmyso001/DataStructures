import java.util.Random;

/**
 *
 * @author Meekaeel Mysorewala
 */
public class InsertionSort {
    int[] list;
    int n;
    Random r = new Random();
    public InsertionSort(int x)
    {
       n = x;
       list = new int[n];
    }
    public void fillArray()
    {
        for(int i = 0; i < list.length; i++)
        {
            list[i] = r.nextInt(10);
        }
    }
    
    public void printArray()
    {
        for(int i = 0; i < list.length; i ++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    
    public void insertionsort()
    {
        for (int i=1; i<list.length; i++)
        {   
            int temp = list[i];
            int j = i-1;
        
            while (j>=0 && temp < list[j])
            {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
        }
    }
}
    


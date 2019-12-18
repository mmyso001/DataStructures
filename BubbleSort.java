import java.util.Random;

/**
 *
 * @author Meekaeel Mysorewala
 */
public class BubbleSort {
   int[] list;
   int n;
   Random r = new Random();
   
   public BubbleSort(int x)
   {
       n =  x;
       list = new int[n];
   }
   
   public void bubbleSort()
   {
   for (int i=0; i<n-1; i++)
   {
     for( int j=0; j<n-i-1; j++)
     {
        if(list[j] > list[j+1])
        {
            int temp = list[j];
            list[j] = list[j+1];
            list[j+1] = temp;
    
        }
     }
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

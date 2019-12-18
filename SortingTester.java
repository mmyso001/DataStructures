import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Meekaeel Mysorewala
 */
public class SortingTester {
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          
        String outputFilename = "output.csv";
        
        PrintWriter output = null;//open output stream
        try
        {
            output = new PrintWriter(new FileWriter(outputFilename));
        } 
        
        catch (IOException ex)
        {
            System.exit(1);
        }
        
        for (int i = 1; i <= 100; i++)
        {
            BubbleSort b = new BubbleSort(300 * i);
            b.fillArray();
            long startTime = System.currentTimeMillis();
            
            b.bubbleSort();
        
            long endTime = System.currentTimeMillis();

            long duration = (endTime - startTime);
            
            System.out.println("Bubble Sort takes "+ duration +" ms"+ " for " + 
                    (300 * i) + " elements");
            
            long bs = duration;
            
            InsertionSort is = new InsertionSort(300 * i);
            is.fillArray();
            startTime = System.currentTimeMillis();
            
            is.insertionsort();
        
            endTime = System.currentTimeMillis();

            duration = (endTime - startTime);
            
            System.out.println("Insertion Sort takes "+ duration +" ms"+ " for " + 
                    (300 * i) + " elements");
            
            long id = duration;
            
            SelectionSort s = new SelectionSort(300 * i);
            s.fillArray();
            startTime = System.currentTimeMillis();
            
            s.selectionsort();
        
            endTime = System.currentTimeMillis();

            duration = (endTime - startTime);
            
            System.out.println("Selection Sort takes "+ duration +" ms"+ " for " + 
                    (300 * i) + " elements");
            
            long ss = duration;
            
            QuickSort q = new QuickSort(300 * i);
            
            q.fillArray();
            
            startTime = System.currentTimeMillis();
           
            q.quicksort();
            
            endTime = System.currentTimeMillis();

            duration = (endTime - startTime);
            
            System.out.println("Quick Sort takes "+ duration +" ms"+ " for " + 
                    (300 * i) + " elements");
            
            long qd = duration;
            
            MergeSort m = new MergeSort(300 * i);
            m.fillArray();
            startTime = System.currentTimeMillis();
            
            m.mergeSort();
        
            endTime = System.currentTimeMillis();

            duration = (endTime - startTime);
            
            System.out.println("MergeSort takes "+ duration +" ms"+ " for " + 
                    (300 * i) + " elements");
            
            long md = duration;
            
            output.println( + 300 * i + ", " + bs + ", " +  id + ", " +  ss + 
                    ", " + qd + ", " + md);
        }
      
        
        
        //close output stream
        output.close();
        
        
        
        // TODO code application logic here
    }
    
}

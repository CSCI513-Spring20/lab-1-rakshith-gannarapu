
public class BubbleSort implements SortStrategy {
	public void getSortTime(long [] population) {
		long [] ar = new long[population.length];
		long startTime = System.currentTimeMillis();
		ar = population;		
		   for (int i = (ar.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (ar[j-1] > ar[j])
		         {
		              long temp = ar[j-1];
		              ar[j-1] = ar[j];
		              ar[j] = temp;
		         } 
		       } 
		    } 
		   
		long endTime = System.currentTimeMillis();
		// Compute the time difference in a method called getSortTime();
		long totalTime = endTime - startTime;
		System.out.println("Time for Bubble sort is "+totalTime+" Milli Seconds");

}
	}

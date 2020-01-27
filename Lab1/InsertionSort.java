
public class InsertionSort implements SortStrategy {
	public void getSortTime(long [] population) {
		long [] ar = new long[population.length];

		ar = population;
		long startTime = System.currentTimeMillis();
		
	   for (int i=1; i< ar.length; i++)
	   {
	      long index = ar[i]; int j = i;
	      while (j > 0 && ar[j-1] > index)
	      {
	           ar[j] = ar[j-1];
	           j--;
	      }
	      ar[j] = index;
	      //System.out.println(ar[j]);
	      
	   } 
	   
		long endTime = System.currentTimeMillis();


		// Compute the time difference in a method called getSortTime();
		long totalTime = endTime - startTime;
		
		
		System.out.println("Time for Insertion sort is "+totalTime+"  Milli Seconds");


}
}


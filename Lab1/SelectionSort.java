
public class SelectionSort implements SortStrategy{
	public void getSortTime(long [] population) {
		long [] ar = new long[population.length];
		long startTime = System.currentTimeMillis();
		ar = population;
		
		for (int i = 0; i < ar.length -1; i++)
		 {
		 int min = i;
		 for (int j = i+1; j < ar.length; j++)
		 {
		 if (ar[j] < ar[min]) { 
			 min = j;
			 long temp = ar[i];
			 ar[i] = ar[min];
			 ar[min] = temp;
		 }
		 } 
		 }

	
		long endTime = System.currentTimeMillis();
		// Compute the time difference in a method called getSortTime();
		long totalTime = endTime - startTime;
		System.out.println("Time for Selection sort is "+totalTime+"  Milli Seconds");
	

}
	}

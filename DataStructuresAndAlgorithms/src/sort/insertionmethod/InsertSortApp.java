package sort.insertionmethod;



public class InsertSortApp
{
	public static void main(String[] args) 
	{
		int maxSize = 1000;
		ArrayInsertion bubbleArray = new ArrayInsertion(maxSize);
		
		for (int i = 0; i < maxSize; i++) // generate and insert random numbers into array
		{
			long n = (long) (java.lang.Math.random() * (maxSize - 1));
			bubbleArray.insertElemnetsToArray(n);
		}
		
		bubbleArray.printArray(); // print the array before sort

		bubbleArray.insertionSort();
		bubbleArray.printArray(); // print the array after sort
	}

}

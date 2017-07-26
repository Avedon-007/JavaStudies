package sort.selectmethod;

public class SelectSortApp 
{
	public static void main(String[] args) 
	{
		int maxSize = 1000;
		ArraySelect bubbleArray = new ArraySelect(maxSize);

		for (int i = 0; i < maxSize; i++) // generate and insert random numbers into array
		{
			long n = (long) (java.lang.Math.random() * (maxSize - 1));
			bubbleArray.insertElemnetsToArray(n);
		}

		bubbleArray.printArray(); // print the array before sort

		bubbleArray.selectionSort();
		bubbleArray.printArray(); // print the array after sort
	}

}

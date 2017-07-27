package sort.bubblemethod;

public class ArrayBubble 
{
	private long[] arr;						// array
	private int numberOfElems;				// number of array element 
//-----------------------------------------------------------------------------------------------------	
	public ArrayBubble(int max)				// constructor
	{
		arr = new long[max];				// create new array
		numberOfElems = 0;					// not any elements yet
	}
//-----------------------------------------------------------------------------------------------------	
	public void insertElemnetsToArray(long value)	
	{
		arr[numberOfElems] = value;			// insert data to array
		numberOfElems++;					// increase element
	}
//-----------------------------------------------------------------------------------------------------
	public void printArray()
	{
		for(int i = 0; i < numberOfElems; i++)
			System.out.print(arr[i] + " ");
		System.out.println();				// move cursor to the new line
	}
//-----------------------------------------------------------------------------------------------------
/*					   <--
*	   _____________outer_loop______________
*	   |								   |
*	12 5 31 548 2 21 6 13 21 26 56 73 1 85 3	
*	|______________________________________|
*	   				inner loop
*	   				   -->
*/	
	
	
	public void bubbleSort()
	{
		int out, in;
		for(out = numberOfElems-1; out > 1; out--)	// outer loop
			for(in = 0; in < out; in++)				// inner loop
				if(arr[in] > arr[in+1])				
					swap(in, in+1);					// swap two elements
	}
//-----------------------------------------------------------------------------------------------------	
	private void swap(int in, int inPlusOne) 
	{
		long temp = arr[in];
		arr[in] = arr[inPlusOne];
		arr[inPlusOne] = temp;		
	}
}

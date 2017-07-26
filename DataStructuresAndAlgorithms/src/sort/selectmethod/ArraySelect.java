package sort.selectmethod;

public class ArraySelect
{
	private long[] arr;
	private int numberOfElems;

// -----------------------------------------------------------------------------------------------------
	public ArraySelect(int max)				// constructor
	{
		arr = new long[max];				// create new array
		numberOfElems = 0;					// not any elements yet
	}

// -----------------------------------------------------------------------------------------------------
	public void insertElemnetsToArray(long value) 
	{
		arr[numberOfElems] = value; 	// insert data to array
		numberOfElems++; 				// increase element
	}

// -----------------------------------------------------------------------------------------------------
	public void printArray() 
	{
		for (int i = 0; i < numberOfElems; i++)
			System.out.print(arr[i] + " ");
		System.out.println(); // move cursor for the new line
	}

// -----------------------------------------------------------------------------------------------------
	
/*					-->
*	_______________outer_loop___________
*	|									|
*	12 5 31 548 2 21 6 13 21 26 56 73 1 85 3
*	   |___________________________________|
*	   				inner loop
*	   				   -->
*	   	
*/	
	public void selectionSort() 
	{																										
		int out, in, min;
		for(out = 0; out < numberOfElems-1; out++)		// outer loop
		{			
			min = out;									// sets the minimum
			for(in = out+1; in < numberOfElems; in++)	// inner loop searches the minimum
				if(arr[in] < arr[min])
					min = in;
			swap(out, min); // swap two elements
		}
		
	}

// -----------------------------------------------------------------------------------------------------
	private void swap(int first, int second) 
	{
		long temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}

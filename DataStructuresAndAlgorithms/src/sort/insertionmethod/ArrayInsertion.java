package sort.insertionmethod;

public class ArrayInsertion 
{
	private long[] arr;
	private int numberOfElems;

// -----------------------------------------------------------------------------------------------------
	public ArrayInsertion(int max)				// constructor
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
		System.out.println(); // move cursor to the new line
	}

// -----------------------------------------------------------------------------------------------------
	
	/*					    -->
	*	   _______________outer_loop___________
	*	   |        						   |
	*	12 5 31 548 2 21 6 13 21 26 56 73 1 85 3
	*	|  |_marker -->						   |
	*	|______________________________________|
	*	   				inner loop
	*	   				   <--
	*	   	
	*/	
	
	public void insertionSort()
	{
		int in, out;
		for(out = 1; out < numberOfElems; out++)
		{
			long temp = arr[out];
			in = out;
			while(in > 0 && arr[in-1] >= temp)
			{
				arr[in] = arr[in-1];
				--in;
			}
		arr[in] = temp;	
		}
	}
}

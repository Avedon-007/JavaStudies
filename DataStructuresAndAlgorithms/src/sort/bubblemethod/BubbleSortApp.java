// Ctrl + Shift + L   -   list of all shortcuts

package sort.bubblemethod;

public class BubbleSortApp {

	public static void main(String[] args) 
	{
		int maxSize =100;		
		ArrayBubble bubbleArray = new ArrayBubble(maxSize);
		
		bubbleArray.insertElemnetsToArray(77);
		bubbleArray.insertElemnetsToArray(99);
		bubbleArray.insertElemnetsToArray(44);
		bubbleArray.insertElemnetsToArray(55);
		bubbleArray.insertElemnetsToArray(22);
		bubbleArray.insertElemnetsToArray(88);
		bubbleArray.insertElemnetsToArray(11);
		bubbleArray.insertElemnetsToArray(0);
		bubbleArray.insertElemnetsToArray(66);
		bubbleArray.insertElemnetsToArray(33);
		bubbleArray.insertElemnetsToArray(21);
		bubbleArray.insertElemnetsToArray(7);
		bubbleArray.insertElemnetsToArray(72);
		bubbleArray.insertElemnetsToArray(75);
		bubbleArray.insertElemnetsToArray(98);
		bubbleArray.insertElemnetsToArray(26);
		bubbleArray.insertElemnetsToArray(17);
		
		bubbleArray.printArray();				// print the array before sort
		
		bubbleArray.bubbleSort();
		bubbleArray.printArray();				// print the array after sort		
		
	}

}

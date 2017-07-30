package sort.objectmethod;

public class ObjectSortApp {

	public static void main(String[] args) 
	{
		int maxSize = 100;
		ArrayInObj arr = new ArrayInObj(maxSize);
		
		arr.insertElemnetsToArray("Patty", "Evans", 24);
		arr.insertElemnetsToArray("Lorraine", "Smith", 37);
		arr.insertElemnetsToArray("Tom", "Yee", 43);
		arr.insertElemnetsToArray("Henry", "Adams", 63);
		arr.insertElemnetsToArray("Sato", "Hashimoto", 21);
		arr.insertElemnetsToArray("Henry", "Stimson", 29);
		arr.insertElemnetsToArray("Jose", "Velasquez", 72);
		arr.insertElemnetsToArray("Henry", "Lamarque", 54);
		arr.insertElemnetsToArray("Minh", "Vang", 22);
		arr.insertElemnetsToArray("Lucinda", "Creswell", 18);
		
		System.out.println("Before sorting");
		arr.displayOfArray();
		
		System.out.println("After sorting");
		System.out.println("Sorting by Last name:");
		arr.insertionSort();
		arr.displayOfArray();

	}

}

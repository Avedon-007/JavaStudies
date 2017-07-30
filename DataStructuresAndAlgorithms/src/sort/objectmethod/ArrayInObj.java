package sort.objectmethod;

public class ArrayInObj 
{
	private Person[] arrayOblect;
	private int numberOfElems;
	
	public ArrayInObj(int max)
	{
		arrayOblect = new Person[max];
		numberOfElems = 0;
	}
	
	public void insertElemnetsToArray(String first, String last, int age)
	{
		arrayOblect[numberOfElems] = new Person(first, last, age);
		numberOfElems++;
	}
	
	public void displayOfArray()					// Print array 'arrayOblect'
	{
		for(int i = 0; i < numberOfElems; i++)
			arrayOblect[i].displayPerson();
		System.out.println();
	}
	
	public void insertionSort()
	{
		int in, out;
		
		for(out = 1; out < numberOfElems; out++)
		{
			Person temp = arrayOblect[out];
			in = out;
			
			while(in > 0 && arrayOblect[in-1].getLastName().compareTo(temp.getLastName()) > 0)
			{
				arrayOblect[in] = arrayOblect[in-1];
				--in;
			}
			arrayOblect[in] = temp;
		}
	}
}

package sort.objectmethod;

public class Person 
{
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String first, String last, int a)
	{
		firstName = first;
		lastName = last;
		age = a;
	}
	
	public void displayPerson()
	{
		System.out.print("First name: " + firstName);
		System.out.print(", Last name: " + lastName);
		System.out.println(", Age: " + age);		
	}
	
	
	public String getLastName()
	{
		return lastName;
	}
}


public class Animal {
	String color;
	int age;
	int height;
	int weight;
	boolean ancestor;
	boolean extinct;
	int numberOfLegs;

	public boolean doesItMakeSound()
	{
		return true;
	}

	public boolean doesItEat()
	{
		return true;
	}

	public boolean doesItDrink()
	{
		return true;
	}		


	public boolean doesItSpeak()
	{
		return false;	
	}

	public void whatSoundItMakes()
	{
		System.out.println("This is just Animal class, I can't say any specific sound that it makes");		
	}

}
package pop.up.model;

	/**
	 * Creates a Thingy object to show access and proper variable types.
	 * @author jrob2049
	 *@version 1.0 09/24/15
	 */

public class Thingy
{
	private String name;
	private int age;
	private double weight;
	
	public Thingy()
	{
		name = ""age = -99;
		age = -99;
		weight = -.008;
		
	}
	public Thingy(String name, int age, double weight)
	{
		//this. refers to the current instance of this obeject (A thingy)
		this.name = name;
		this.age= age;
		this.weight = weight;
	}
	
	
	
}

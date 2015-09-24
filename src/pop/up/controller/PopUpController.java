package pop.up.controller;

import pop.up.model.Thingy;
import pop.up.view.PopupDisplay;

public class PopUpController
{
	private PopupDisplay myPopups;
	private Thingy myTestThing;
	public PopUpController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String myName = myPopups.grabAnswer("Type in your name");
		myPopups.showResponse("you typed in: + myName");
		
		String temp = myPopups.grabAnswer("Type in your age");
		int myAge;
		
		
	
		if(isInteger(temp))
		{
			myAge = Integer.parseInt(temp);
		}
		
		else
		{
			myAge = -9999999;
		}
		
		
		
		String tempWeight = myPopups.grabAnswer("Type in your weight")
		double myWeight = Double.parse
		myPopups.showResponse("you typed" + myWeight);
		
		myTestThing = new Thingy(myName,myAge,myWeight);
	}
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try 
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		return isInt;
	}


	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
			
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse(" is not a double");
		}
		
		return isDouble;
		
	}
}


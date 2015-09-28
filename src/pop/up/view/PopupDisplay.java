package pop.up.view;

import javax.swing.JOptionPane;
/**
 * A popup display class used for showing input and output.
 * @author jrob2049
 *@version 1.0 09/24/15
 */

public class PopupDisplay
{
	/**
	 * displays the supplied text as a popup window
	 * @param wordsFromSomewhere The text to be displayed
	 * @version 1.0 09/24/15
	 */
	public void showResponse(String wordsFromSomewhere)
	
	/**
	 * Displays a popup with a field to type in a response.
	 * It returns the answer to the supplied question as a String.
	 * @param stuff A question to be displayed in a popup window.
	 * @return The user's inputas a String data type.
	 */
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
		
		// THE DIFFRENT TYPES OF WACKS FOR CODE NOTES (1,2,3)
		
		/*
		 * 
		 */
		//
		/**
		 * 
		 * @param stuff
		 * @return
		 */
		 
		 
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
	
}

package ie.murph.math.gui;

import java.util.Scanner;

import ie.murph.math.theory.IVolume;

public class ConsoleGUI {
	
	private final Scanner M_SCANNER = new Scanner(System.in);
	
	public void runMathLearningGUI()
	{
		askStudentIfTheyWishToContinueLearaning();
	}
	
	// Method to ask the user if they want to try another card again.
	public void askStudentIfTheyWishToContinueLearaning()
	{
		System.out.println(IVolume.WELCOME_TO_MATH_LEARNING);
		
		String s_studentInput = this.M_SCANNER.nextLine();
		if(studentWantsToContinueLearning(s_studentInput))
		{
			
			this.askStudentIfTheyWishToContinueLearaning();
		}
		else if (studentWantsToLeaveLearning(s_studentInput))
		{
			
		}
		else
			this.askStudentIfTheyWishToContinueLearaning();
		
//		System.out.println(ConsoleText.GOODBYE.toString());
//		System.exit(0);
	}

	private boolean studentWantsToLeaveLearning(String studentInput) {
		return studentInput.equalsIgnoreCase("n") || studentInput.equalsIgnoreCase("no");
	}

	private boolean studentWantsToContinueLearning(String studentInput) {
		return studentInput.equalsIgnoreCase("y") || studentInput.equalsIgnoreCase("yes");
	}

}

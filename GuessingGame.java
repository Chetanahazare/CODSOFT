import javax.swing.*;

public class GuessingGame {
	public static void main(String args[])
	{
		int computerNumber = (int)(Math.random()*100+1);
		int userAnswer = 0;
		int count = 1;
		
		while(userAnswer!=computerNumber)
		{
			String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100","Guessing Number Game",3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, " "+determineGuess(userAnswer,computerNumber,count));
			count++;
			
		}
	}
	
	public static String determineGuess(int userAnswer, int computerNumber,int count) {
		if(userAnswer <=0 || userAnswer >100) {
			return "Invalid guess";
		}
		else if(userAnswer == computerNumber) {
			return " Hurray !!Correct!You Win !\nTotal Guesses:"+ count;
		}
		else if(userAnswer > computerNumber) {
			return " Nope !! Your guess is too high, Guess Again.\nNumber of guess:"+count;
		}
		else if(userAnswer < computerNumber) {
			return "Nope !! Your guess is too low, Guess Again.\nNumber of guess:"+count;
		}
		else {
			return "Aww !!Your guess is incorrect\nNumber of Try:"+count;
		}
	}

}
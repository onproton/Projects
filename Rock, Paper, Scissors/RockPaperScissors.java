import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
	public static void main(String[] args) {
		// variables to store user and computer plays, the winner, and the while loop control etc.
		String userPlay;
		int compPlay;
		int gameWinner;
		int ties = 0;
		int wins = 0;
		int losses = 0;
		boolean playAgain = true;
		
		Scanner input = new Scanner(System.in);
		
		//loop that continues the game while the player still wants to play
		while (playAgain == true) {			
			System.out.print("Ready to play Rock, Paper, Scissors? Enter your play: rock, paper, or scissors: ");
			userPlay = input.next(); //stores the input into userPlay
			input.nextLine(); // clears the next line
			//prints out your play
			System.out.println("You play " + userPlay);
            
			// as long as the user plays rock, paper, or scissors...do this
			if (userPlay.equalsIgnoreCase("rock") || userPlay.equalsIgnoreCase("paper") || userPlay.equalsIgnoreCase("scissors")) {

				//generates random computer play and prints out the result
				Random rand = new Random();
				int randomNum = rand.nextInt(3 + 1);
				compPlay = randomNum;

				// Alerts the player to the computer's 'choice'
				if (compPlay == 1) {
					System.out.println("The computer plays rock");}
				if (compPlay == 2) {
					System.out.println("The computer plays paper");}
				if (compPlay == 3) {
					System.out.println("The computer plays scissors");}
    			
    			
				//compares the two plays - could add exception handling
				gameWinner = RockPaperScissors.calcWinner(compPlay, userPlay);
				if (gameWinner == 1) {
					System.out.println("You Win!");
					wins = wins + 1;} // adds to your win total
				else if (gameWinner == 2) {
					System.out.println("Sorry, Computer wins.");
					losses = losses + 1;} //adds to you losses total
				else if (gameWinner == 3) {
					System.out.println("It's a tie!");
					ties = ties + 1; // adds to your ties total
				}
    			
				// Prints out your win/loss totals for the current game
				System.out.println("You have " + wins + " wins, " + losses + " losses, and " + ties + " ties this game.");
    			
				// Checks if user wants to play again
				System.out.println("Would you like to play again? (yes/no) ");
				String userPlayAgain = input.nextLine();
    			
				// as long as yes or no entered, determines to start over or not
				if (userPlayAgain.equalsIgnoreCase("yes") || userPlayAgain.equalsIgnoreCase("no")) {
					if (userPlayAgain.equalsIgnoreCase("yes")) {
						System.out.println("Let's play again!");
						playAgain = true;}
					else if (userPlayAgain.equalsIgnoreCase("no")) {
						System.out.println("Thanks for playing!");
						playAgain = false;}
    				}
				// if yes or no not entered properly, asks again
				else {
					System.out.println(userPlayAgain + " is not a valid entry. Please enter yes or no.");
					System.out.println("Would you like to play again? (yes/no) ");
					userPlayAgain = input.nextLine();
				}
       
			}
            
            
			// else if rock paper or scissors not entered correctly, starts while loop again.
			else {
				System.out.println(userPlay + " is not a valid entry. Please enter rock, paper, or scissors");
			}
		}	
	}
		
	
	// Method to calculate the winner
	public static int calcWinner(int compSelect, String userSelect) {		
		int winner;
		
		// if the user(1) wins:
		if (compSelect == 1 && userSelect.equalsIgnoreCase("paper")) {
			winner = 1;
			System.out.println("Paper beats rock.");}
		else if (compSelect == 2 && userSelect.equalsIgnoreCase("scissors")) {
			winner = 1;
			System.out.println("Scissors beats paper.");}
		else if (compSelect == 3 && userSelect.equalsIgnoreCase("rock")) {
			winner = 1;
			System.out.println("Rock beats scissors.");}
		
		// if computer(2) wins:
		else if (compSelect == 1 && userSelect.equalsIgnoreCase("scissors")) {
			winner = 2;
			System.out.println("Rock beats scissors.");}
		else if (compSelect == 2 && userSelect.equalsIgnoreCase("rock")) {
			winner = 2;
			System.out.println("Paper beats rock.");}
		else if (compSelect == 3 && userSelect.equalsIgnoreCase("paper")) {
			winner = 2;
			System.out.println("Scissors beats paper.");}
		
		//if it is a tie:
		else {
			winner = 3;}
		
		// returns the integer 1, 2, or 3 based on who wins
		return winner;
	}

}
import java.util.Scanner;

public class MathGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int toBeGuessed, min, max, guess;
		Boolean play = true;
		
		while(play == true) {
					
			min = biggerNum(-1, scan);
			max = biggerNum(min, scan);
				
			toBeGuessed = (int) Math.floor(Math.random() * (max - min + 1) + min);
			
			do {
				System.out.print("Guess the number between " + min + " and " + max + ":");
				guess = scan.nextInt();
				
			} while(guess != toBeGuessed);
			
			System.out.println("CONGRATS!");
			
			
			//play again?
			char response;
			do {
				
			System.out.println("Would you like to play again? (y/n)");
			
			response = scan.next().charAt(0);
			
			} while(response != 'y' || response != 'n');
			
			if(response == 'n') {
				play = false;
			}
		}
	}
	
	public static int biggerNum(int num, Scanner scanner) {
		
		int bigger;
			
		do {
			System.out.println("Input a num larger than " + num);
			bigger = scanner.nextInt();
		} while(bigger <= num);
		
		return bigger;
	}
	
}

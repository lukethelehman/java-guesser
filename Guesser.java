//Guesser.java

public class Guesser {
	java.util.Scanner input = new java.util.Scanner(System.in);

    public static void main(String[] args) {
		new Guesser();
	}

	public Guesser(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = menu();
			if (response.equals("0")){
				keepGoing = false;
			}
			else if (response.equals("1")){
				System.out.println();
				System.out.println("Human Guesser");
				humanGuesser();
			}
			else if (response.equals("2")){
				System.out.println();
				System.out.println("Computer Guesser");
				System.out.println("Think of a number between 1-100");
				computerGuesser();
			}
		}
	}

	public String menu(){
		System.out.println("0) Exit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");
		System.out.print("Please enter 0-2: ");
		String response = input.nextLine();
		return response;
	}
	public void humanGuesser(){
		int correct = (int) (Math.random() * 100) + 1;
		int guess;
		int turns = 0;
		boolean keepGoing = true;
			while (keepGoing){
				turns++;
				System.out.print("Please enter a number between 1-100: ");
				guess = input.nextInt();
				input.nextLine();
				if (guess == correct){
					System.out.println("That's right! It took you " + turns + " turns.");
					System.out.println();
					keepGoing = false;
				}
				else if (guess < correct){
					System.out.println("Too low...");
				}
				else if (guess > correct){
					System.out.println("Too high...");
				}
			}
	}
	public void computerGuesser(){
		int lowerBound = 1;
		int upperBound = 100;
		int guess = getMean(lowerBound, upperBound);

		int turns = 0;
		boolean keepGoing = true;

		while (keepGoing){
			turns++;
			System.out.println(turns + ") I guess " + guess);
			System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");
			String response = input.nextLine();
			if (response.equals("h")){
				upperBound = guess;
				guess = getMean(lowerBound, upperBound);
			}
			if (response.equals("l")){
				lowerBound = guess;
				guess = getMean(lowerBound, upperBound);
			}
			if (response.equals("c")){
				System.out.println();
				keepGoing = false;
			}
		}
		
	}




	public int getMean(int lowerBound, int upperBound){
		int mean = (lowerBound + upperBound) / 2;
		return mean;
	}
}

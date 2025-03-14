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
			if (response.equals("1")){
				humanGuesser();
			}
			if (response.equals("2")){
				computerGuesser();
			}
		}
	}

	public String menu(){
		System.out.println("0) Exit");
		System.out.println("1) Human Guesser");
		System.out.println("0) Computer Guesser");
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
				System.out.print("Please enter a number: ");
				guess = input.nextInt();
				if (guess == correct){
					System.out.println("That's right! It took you " + turns + " turns.");
					keepGoing = false;
				}
				if (guess < correct){
					System.out.println("Too low...");
				}
				if (guess > correct){
					System.out.println("Too high...");
				}
			}
	}
	public void computerGuesser(){
		System.out.println("computerGuesser");
	}
}

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
		System.out.println("humanGuesser");
	}
	public void computerGuesser(){
		System.out.println("computerGuesser");
	}
}

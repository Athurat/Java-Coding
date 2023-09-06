package FirstStep;

public class McAlvin {

	public static void main(String[] args) {

	    // Establish the variables that contain the quotes, or half of each quote to use in justification
		String favoritequote  = "In war, prepare for peace; in peace, prepare for war.";
		String favoritequote2 = "and know thy enemy.";
		String favoritequote3 = "So in war, the way is to avoid what is strong,-->";
		// Tabs the 1st quote to the right and starts a new line for code 2
		System.out.printf("\t" + favoritequote + "\n");
		//Right justifies the quote variable 30 spaces
		System.out.printf("Know thy self--> %30s",favoritequote2);
		//Creates a new line and Left justifies the quote variable by 60 spaces
		System.out.printf("\n" + "%-60s and strike what is weak.",favoritequote3);

	}

}

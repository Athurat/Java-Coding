/**
 * 
 */
package Main;

/**
 * 
 */
import java.util.Scanner;
public class testspace {

	/**
	 * @param args
	 */
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		String firstname;
		String middlename;
		String lastname;
     
		System.out.print("Hello, What is your first name? :");
		firstname = userinput.nextLine();
		
		System.out.print("Great! now what is your middle name? :");
		middlename = userinput.nextLine();
		
		System.out.print("Awesome! Lastly, what is your last name? : ");
		lastname = userinput.nextLine();
		
		System.out.println("Hey, jsut remember, when you are feeling down, just know that you are ⚡" + firstname+"." + middlename+"." + lastname + "⚡.");
		System.out.println("So get out there and 把握光阴 as they say !!!");
		
		
	}

}

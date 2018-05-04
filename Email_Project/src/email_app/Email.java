package email_app;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	// Constructor for receiving first and last name
	public Email(String firstName, String lastName) {
		// "this" denotes the variable on the class level
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department - return the department
		// Sets our private class variable (department) above to the information that the user will enter below
		this.department = setDepartment();
		// Prints the department the user has specified
		System.out.println("Department: " + this.department);
	
	// Call a method that returns a random password
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your password is " + this.password);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales"; }
		else if (depChoice ==2) { return "dev"; }
		else if (depChoice ==3) { return "acct"; }
		else { return ""; }
	}
	
	// Generate a random password
	// 
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRXTUV0123456789!@$&";
		char[] password = new char[length];
		// Iterate through - for each character in the array
		for (int i=0; i<length; i++) {
			// multiplying by however many characters in passwordSet
			int rand = (int) (Math.random() * passwordSet.length());
			// set the random number at the postition "i"
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	
	// Set the alternate email
	
	// Change the password

}

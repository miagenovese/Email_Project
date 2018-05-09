package email_app;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	// Constructor for receiving first and last name
	public Email(String firstName, String lastName) {
		// "this" denotes the variable on the class level
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department - return the department
		// Sets our private class variable (department) above to the information that the user will enter below
		this.department = setDepartment();
	
	// Call a method that returns a random password
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your password is " + this.password);
	
	// Combine elements to generate email
	email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("New Employee: "+ firstName + " \nDepartments:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code");
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
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Get methods
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }

	public String showInfo() { 
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}

package emailapp;

import java.util.Scanner;

public class Email 
{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxNum = 200;
	private String altEmail;
	private int numLength = 10;
	private String corpName = "Cookcompany.com";
	
	//The Constructor to receive the first name and last name for the user
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("The name:" + this.firstName +" " + this.lastName);
		
		//Calling the method to retrieve the department
		this.department = setDepartment();
		System.out.println(department);
		
		//Calling the method generating the password randomly
		this.password = randomPassword(numLength);
		System.out.println("Your password is:\n" + password);
		
		//Email creation
		System.out.println("\nThis is your Email:");
		System.out.print(this.lastName + this.firstName + "@" + corpName);

	}
	//Ask for the department
	//Creating a method to retrieve the department the person wants.
	private String setDepartment()
	{
		System.out.println("Pick a number according to each department:\n");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1)
		{
			return "Sales";
		}
		else if(depChoice == 2)
		{
			return "Account";
		}	
		else if(depChoice == 3)
		{
			return "Dev";
		}			
		else
		{
			return " ";
		}
	}
	//Generate random password
	private String randomPassword(int length)
	{
		System.out.println("Welcome to the random password generator.\n");
		String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] password = new char[length];
		for (int i = 0; i < length; i++)
		{
			int rand = (int)(Math.random() * setPassword.length());
			password[i] = setPassword.charAt(rand);
		}
		return new String(password);
		
	}
	//Set the mailbox capacity
	public void setMailbox(int capacity)
	{
		this.mailboxNum = capacity;
	}
	//Set the Alt email
	public void setAlternateEmail(String alternateEmail)
	{
		this.altEmail = alternateEmail;
	}
	//Change the password
	public void changePassword(String password)
	{
		this.password = password;
	}
	//Using get methods to encapsulate/data binding
	public int getMailboxCapacity()
	{
		return mailboxNum;
	}
	//Using get methods to encapsulate/data binding
	public String getAlternateEmail()
	{
		return altEmail;
	}
	//Using get methods to encapsulate/data binding
	public String getPassword()
	{
		return password;
	}
}

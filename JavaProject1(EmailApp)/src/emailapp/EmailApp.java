package emailapp;

public class EmailApp
{
	public static void main (String[] args)
	{
		Email em1 = new Email("Dre","Cook");
		
		em1.setAlternateEmail("\ndrecook16@gmail.com");
		System.out.print(em1.getAlternateEmail());
	}
}

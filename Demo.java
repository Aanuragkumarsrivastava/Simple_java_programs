import java.util.Random;
import java.util.Scanner;
class Demo 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a whole number:");
		int n=input.nextInt();
		
		System.out.println("You just entered "+n+"\nPress enter to continue....");
		
		Random r = new Random();
		int low = 20;
		int high = 40;
		int result = r.nextInt(high-low) + low;
		
		System.out.println("The computer just generated a random number between 20 to 40, and it \n"+result);
		
		System.out.println("\nWe are about to determine the difference and the smaller number.\n Press enter to continue...");
		
		int diff;
		
		if(result>n)
		{
			diff=result-n;
			System.out.println("The smaller number is "+n+"\nThe difference of the two numbers is "+diff);
			
		}
		else
		{
			diff=n-result;
		    System.out.println("The smaller number is "+result+"\nThe difference of the two numbers is "+diff);
		}
		  	
		System.out.println("\nPlease enter a sentence that includes the word \"like\"\n");    
		
		input.nextLine();//will consume that newline character.
		String a=input.nextLine();
		
		System.out.println(a);
		
		System.out.println("We have replaced to \"like\" with \"dislike\" and turn the whole sentence to all uppercases.");
		
		String s1=a.replaceAll("like","dislike");
		
		System.out.println(s1);
		
		String finalstring=s1.toUpperCase();
		
		System.out.println("The resulting sentence is: "+finalstring);
		
	}

}

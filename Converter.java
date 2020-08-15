import java.util.Scanner;

public class Converter 
{
	public static void main(String[] args)
	{
		final double ZAR=9.91; //final variable Zar is declared here		

		Scanner in=new Scanner(System.in);//Scanner class in java is used to take input from the user
		
		System.out.println("Enter the amount of money in AUD:");
		
		double  AUS=in.nextDouble();//takes double type input

		double FINALZAR=ZAR*AUS;

		System.out.println("AUD  "+AUS+"  is worth ZAR  "+FINALZAR);		
		
	}

}

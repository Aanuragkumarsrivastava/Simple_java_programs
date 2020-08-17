import java.util.Scanner;
public class Demo2
{
	public static void main(String[] args)
	{
		function();
	}
	
	public static void function()
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the gender of your future child. Use 1 for female, 0 for male.");
		
		int gender=in.nextInt();//here it will take the input for gender
		
		System.out.println("Enter the height in inches of the mom.");
		
		int mheight=in.nextInt();
		
		System.out.println("Enter the height in inches of the dad.");
		
		int dheight=in.nextInt();
		
		int predicted_height=cheight(gender,mheight,dheight);
		
		System.out.println("Your future child is estimated to grow to "+predicted_height+"inches.");
		
        System.out.println("Enter 'Y' to run again, anything else to exit.");
		
		String x=in.next();
		
		if(x.contentEquals("Y"))
		{
			function();
		}
		else
		{
			System.out.println("Program ends.");
		}
	}

	public static int cheight(int gender,int mheight,int dheight)
	{
		if(gender==0)
		{
			int n=mheight*13/12;
			int male_child_height=(n+dheight)/2;
			return male_child_height;
		}
		else
		{
			int m=dheight*12/13;
			int female_child_height=(m+mheight)/2;
			return female_child_height;
		}
	}

}
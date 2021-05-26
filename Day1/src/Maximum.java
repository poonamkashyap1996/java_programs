import java.util.Scanner;
public class Maximum 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
			System.out.println("max="+a);
			}
			else
			{
				System.out.println("max="+c);
			}
		}
		if(b>c)
		{
			System.out.println("max="+b);
		}
		else
		{
			System.out.println("max="+c);
		}
	}
}

		




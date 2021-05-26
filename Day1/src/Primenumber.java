import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i,flag=0;
		System.out.println("Enter the number you want to check");
		n=sc.nextInt();
		if(n<2)
		{
			System.out.println("It is not a prime number");
			System.exit(1);
		}
		for(i=2;i<n/2;i++)
		{
			if(n%2==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
		
		
			
		

	}

}

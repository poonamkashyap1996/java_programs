import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,r,n,temp,s=0;
		System.out.println("Enter the number you want to check");
		n=sc.nextInt();
		temp=n;
		for( ;n!=0; )
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
			
			
		}
		if(temp==s)
		{
			System.out.println("it is palindrome");
			
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		

	}

}

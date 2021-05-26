import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,r,sum=0,temp;
		System.out.println("Enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("It is Armstrong Number");
		}
		else
		{
			System.out.println("It is not a Armstrong Number");
		}
	}

}

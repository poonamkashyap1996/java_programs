import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0,sum1=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			else
			
				sum1=sum1+i;
				
			}
		System.out.println("sum of even numbers is"+sum);
		System.out.println("sum of odd numbers is"+sum1);
		}
		


	}


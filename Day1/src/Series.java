import java.util.Scanner;
public class Series {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;
		System.out.println("Enter the value of n for sum of series");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of series upto n is"+sum);

	}

}

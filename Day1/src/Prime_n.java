import java.util.Scanner;
public class Prime_n {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,count;
		System.out.println("Enter the number");
		n=sc.nextInt();  //11
		System.out.println("Prime numbers between 1 to "+n+" are:");
		for(i=2;i<=n;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++; 
				}
			}
			
		if(count==2)
		{
			System.out.print(i+" ");
		}
		
	}
	}

}

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,r,s=0;
		System.out.println("enter the number");
		n=sc.nextInt();
		for( ;n!=0; )
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
			System.out.println("Reverse of a number is"+s);
	}

}

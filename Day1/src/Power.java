import java.util.Scanner;
public class Power {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,x;
		System.out.println("Enter the number");
		n=sc.nextInt();
		System.out.println("Enter the power");
		x=sc.nextInt();
		double p=Math.pow(n,x);
		System.out.println("power of number is"+p);
		
		

	}

}

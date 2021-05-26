import java.util.Scanner;
public class Powermton {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double m,n,p;
		System.out.println("Enter the value of m");
		m=sc.nextDouble();
		System.out.println("Enter the value of n");
		n=sc.nextDouble();
		p=Math.pow(m,n);
		System.out.println("m to the power n is"+p);

	}

}

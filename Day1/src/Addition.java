import java.util.Scanner;
public class Addition {
	
	public static void main(String[] args) 
	{
		int a,b,result;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers for addition");
		a=sc.nextInt();
		b=sc.nextInt();
		result=a+b;
		System.out.println("Addition of two numbers is"+result);
		
		//addition of characters
		String c,d;
		System.out.println("Enter the two characters");
		c=sc.next();
		d=sc.next();
		System.out.println("Addition of two characters is "+c   +d);
	}

}

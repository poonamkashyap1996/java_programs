import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("numbers after swapping are"+a +b);
		
		

	}

}

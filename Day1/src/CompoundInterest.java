import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double p=20000,r=6,n=3;
		double ca,ci;
		ca=p*Math.pow(1+(r/100),n);
		ci=ca-p;
		System.out.println("Compound Amount is"+ca);
		System.out.println("Compound Amount is"+ci);
		
		
	}

}

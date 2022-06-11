import java.util.Scanner;

public class SeleniumTraining {

	public static void main(String[] args) {
		// s = ut+1/2*a*t*t
		double s ; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter u = ");
		float u = sc.nextFloat();
		System.out.print("Please Enter a = ");
		float a = sc.nextFloat();
		System.out.print("Please Enter Time = ");
		double t = sc.nextDouble();
		s = ((u*t) + (1/2*a*(Math.pow(t, 2))));
		System.out.println(s);
		System.out.print("The Result is = " + Math.round(s));
		
		

	}

}

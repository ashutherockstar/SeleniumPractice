import java.util.Scanner;

public class PatternPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Floyd Triangle in Reverse Order
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int k  =1;
//		for(int i=0; i < n; i++) {
//			for(int j = i ; j < n-1 ; j ++) {
//				System.out.print(k);
//				System.out.print("\t");
//				k++;
//			}
//			System.out.println(" ");
//		}

		// Floyd Triangle
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int k  =1;
//		for(int i=0; i < n; i++) {
//			for(int j = 0 ; j <= i ; j++) {
//				System.out.print(k);
//				System.out.print("\t");
//				k++;
//			}
//			System.out.println(" ");
//		}

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		for(int i=1; i < n; i++) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print(j);
//				System.out.print("\t");
//	
//			}
//			System.out.println(" ");
//		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k*3);
				System.out.print("\t");
				k++;

			}
			System.out.println(" ");
		}

	}

}

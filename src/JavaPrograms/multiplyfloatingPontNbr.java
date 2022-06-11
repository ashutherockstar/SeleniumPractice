package JavaPrograms;

import java.util.Scanner;

public class multiplyfloatingPontNbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x  = 4.25f;
		float y = 5.36f;
		System.out.println(x*y);
		
		//WAP to print ascii value of Charater
		char ch = 'a';
		int ascii = ch;
		System.out.println(ascii);
		
		//WAP Swap two Nbrs
		int a  =  5;
		int b = 6;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a+ " " + b);
		
		//WAP to chk whether Alphabet is vowel or consonant
		char n = 'c';
		if (n =='a' || n == 'e' || n== 'i' || n == 'o' || n == 'u') {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
		
		//WAP to find Greatest of Three nbr
		int m =9;
		int t = 6 ;
		int o = 1 ;
		if( m > t && m > o ) {
			System.out.println("largest nbr"+ "  "+ m);
		}else if(t  > o) {
			System.out.println("largest nbr"+t);
		}else {
			System.out.println("largest nbr"+o);
		}
		
		//WAP to find leap year
	}

}

/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int nom2 = sc.nextInt();
		int nom3 = nom2 + 1;
		int nom4 = nom3 + 1;
		int nom5 = nom4 + 1;
		int nom6 = nom5 + 1;
		int nom7 = nom6 + 1;
		System.out.println("Here are the next 5 numbers!");
		System.out.println(nom3 + ", " + nom4 + ", " + nom5 + ", " + nom6 + ", " + nom7);
		System.out.println("Here are the next 5 multiples of " + nom2);
		int nom8 = nom2*1;
		int nom9 = nom2*2;
		int nom10 = nom2*3;
		int nom11 = nom2*4;
		int nom12 = nom2*5;
		System.out.println(nom8 + ", " + nom9 + ", " + nom10 + ", " + nom11 + ", " + nom12);
		System.out.println("Here is " + nom2 + " divided by 100!");
		double nom13 = nom2/100.0;
		System.out.println(nom13);
		System.out.println("Here is " + nom2 + " divided by 10!");
		double nom14 = nom2/10.0;
		System.out.println(nom14);
		
		
		
		


	}
}

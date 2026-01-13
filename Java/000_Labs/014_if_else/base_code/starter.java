/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 1000");
		int n = sc.nextInt();
		int o = 45;
		
		if(o==n){
			System.out.println("Yup thats correct");
		}
		else if(o!=n){
			System.out.println("nope that's wrong try again");
		}
		
	}
}
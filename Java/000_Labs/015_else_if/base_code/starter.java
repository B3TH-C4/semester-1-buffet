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
		int m = sc.nextInt();
		int o = 45;
		if(o==m){
			System.out.println("Good job that's correct");
		}
		else if(m>o){
			System.out.println("You're a bit higher than the number so you're wrong...try again");
		}
		else{
			System.out.println("You're a bit lower than the number so you're wrong...try again");
		}
		
	}
}

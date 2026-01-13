/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets play a guessing game!!!");
		int num = ((int)(Math.random())*1000);
		System.out.println("Guess...the....NumBER");
		int guess = sc.nextInt();
		while((guess<num) || (guess>num)){
			if(guess==num){
			System.out.println("Good job that's correct");
			break;
			}
			System.out.println("Your number is eith lower or higher try again");
			break;
		}



		
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String nom = sc.nextLine();
	
		System.out.println("what month is your birthday?");
		String nom2 = sc.nextLine();
	
		System.out.println("What day is your birthday?");
		int nomnom3 = sc.nextInt(); 
	
		System.out.println("What year were you born in?");
		int nomnom34= sc.nextInt();
		
			System.out.println("How old are you?");
		int nomnom1 = sc.nextInt();
	
		System.out.println("How much is a buck fifty?");
		int nomnomnom = sc.nextInt();
		
		System.out.println("Your name is " + nom + ".");
		System.out.println("Your birthday is " + nom2 + " " + nomnom3 + ", " + nomnom34 + "." );
		System.out.println("You are " + nomnom1 + " years old.");
		System.out.println("A buck fifty is $" + nomnomnom + ".");
		
	}
}

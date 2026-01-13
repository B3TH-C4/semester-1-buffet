/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int nom= sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first one):");
		int nom2 = sc.nextInt();
		
		System.out.println("Your range is " + nom + " to " + nom2 + ".");
		System.out.println("Here are 5 numbers generated in that range:");
		System.out.println((int) (Math.random()*(nom2-nom)+(nom)));
		System.out.println((int) (Math.random()*(nom2-nom)+(nom)));
		System.out.println((int) (Math.random()*(nom2-nom)+(nom)));
		System.out.println((int) (Math.random()*(nom2-nom)+(nom)));
		System.out.println((int) (Math.random()*(nom2-nom)+(nom)));
		
	}
}

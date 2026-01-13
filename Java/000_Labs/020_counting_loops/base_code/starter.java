/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.prinln("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times do you want your name to print out?");
		int times = sc.nextInt();
		
		while(true){
			if(name){
				break;
			}
			System.out.println(name);
		}
		



		
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write an integer");
		int bom = sc.nextInt();
		System.out.println("Now write another integer");
		int nom = sc.nextInt();
		System.out.println("And now another one!");
		int dom = sc.nextInt();
		
		if((nom>bom) && (nom>dom)){
			System.out.println("The largest integer is " + nom);
		}
		else if((bom>nom) && (bom>dom)){
			System.out.println("The largest integer is " + bom);
		}
		else if((dom>nom) && (dom>bom)){
			System.out.println("The largest integer is " + dom);
		}
		
		
		if((nom<dom) && (nom<bom)){
			System.out.println("The smallest integer is " + nom);
		}
		else if((bom<nom) && (bom<dom)){
			System.out.println("The smallest integer is " + bom);
		}
		else if((dom<nom) && (dom<bom)){
			System.out.println("The smallest integer is " + dom);
		}
		
		
		
		
		
		
	}
}

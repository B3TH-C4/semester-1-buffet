/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write an integer");
		int nom = sc.nextInt();
		System.out.println("Write another integer");
		int nomnom = sc.nextInt();
		boolean nommer = nom > nomnom;
		if(nommer){
			System.out.print("HAHAHAHA IT WORKS NOMNOMNOM");
		}
		else if(nom==nomnom){
			System.out.print("NOMNOMNOMNOMNOM");
		}
		else if(nom<=nomnom){
			System.out.print("Nom i'm tired");
		}
	}
}

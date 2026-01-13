/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = sc.nextLine();
		if(word.equals("cat")){
			System.out.println("   |\\___/,|   ('\\ ");
			System.out.println("_. |o o    |_   )  ) ");
			System.out.println("-(((---(((-------- ");
		}
		else if(word.equals("shoe")){
			System.out.println(" ____");
			System.out.println("| == '\\___");
			System.out.println("\\________/");
		}
		else if(word.equals("face")){
			System.out.println(" _______");
			System.out.println("/________\\");
			System.out.println("|  o  o   |");
			System.out.println("\\   ^    /");
			System.out.println("  \\____/ ");
			
		}
		else{
			System.out.println("this answer is invalid");
		}
	}
}

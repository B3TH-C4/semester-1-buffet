/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int Num = sc.nextInt();
		int X = 0;
		int rows = 0;
		while(rows<Num){

		while(X < rows+1){
			X = X + 1;
			System.out.print("＊");
		}
		System.out.println();
		X = 0;
		rows = rows + 1;
	}
	}
}

/*()
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose...Wizard, Warrior, or Rogue.");
		String nob = sc.nextLine();
		if(nob.equals("Wizard")){
			
		}
		else if(nob.equals("Warrior")){
			System.out.println("You are a warrior");
		}
		else if(nob.equals("Wizard")){
			System.out.println("You are a wizard");
		}
		else if(nob.equals("Rogue")){
			System.out.println("You are a rogue")
		}
		else{
			System.out.pritnln("This answer is invalid");
		}
		
		System.out.println("You are a " + nob);
		
	}
}

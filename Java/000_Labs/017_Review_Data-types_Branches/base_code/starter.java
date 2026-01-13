/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		System.out.println("Write a name");
		String bob = sc.nextLine();
		System.out.println("write a title for your name");
		String bon = sc.nextLine();
		
		System.out.println("Choose...Wizard, Warrior, or Rogue.");
		String nob = sc.nextLine();
			
		if(nob.equals("Warrior") || (nob.equals("warrior"))){
			System.out.println("You are a warrior");
		}
		else if(nob.equals("Wizard") || (nob.equals("wizard"))){
			System.out.println("You are a wizard");
		}
		else if(nob.equals("Rogue") || (nob.equals("rogue"))){
			System.out.println("You are a rogue");
		}
		else{
			System.out.println("This answer is invalid");
		}
		
		
		int nymph = 20;
		int ten = 10;
	
		System.out.println("You have 20 points to spend");
	
		System.out.println("Strength (buff and able to carry larger items):");
		int blob = sc.nextInt();
		if(blob>ten){
			System.out.println("this answer is invalid");
		}
	
		System.out.println("Dexterity (Agile and moves quick):");
		int nowb = sc.nextInt();
		if(nowb>ten){
			System.out.println("This answer is invalid");
		}
	
		System.out.println("Intelligence (Better at magic spells!):");
		int nom = sc.nextInt();
		if(nom>ten){
			System.out.println("This answer is invalid");
		}
	
		System.out.println("Charisma (How personable):");
		int bog = sc.nextInt();
		if(bog>ten){
			System.out.println("This answer is invalid");
		}
		int nom2 = blob + nowb + nom + bog;
		
		if(nom2<ten){
			System.out.println("You have " + nom2 + " points left.");
		}
		else if(nom2>nymph){
			System.out.println("This is over 20");
		}
		System.out.println(bob + " " + bon + " " + nob);
		System.out.println("strength:" + blob);
		System.out.println("Dexterity:" + nowb);
		System.out.println("Intelligence:" + nom);
		System.out.println("Charisma:" + bog);
	}
}

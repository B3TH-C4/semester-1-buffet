/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("SLOT MACHINE GAME!!!");
		System.out.println("ToTaLlY nOt GaMbLiNg ;)");
		System.out.println("If two numbers are the same, it doubles your money wager");
		System.out.println("If 3 numbers are the same, your money wager triples");
		System.out.println("If no numbers are the same, you lose");
			int bal = 100;
			int x = 0;
			
			
			while(true){
				if(x==1){
					break;
				}
				System.out.println("Would you like to play? Yes/yes/Y/y");
				String choice = sc.nextLine();
				if (choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y")){
					System.out.println("Great! Let's play!");
					System.out.println("You get to spend up to $" + bal);
					System.out.println("How much do you want to spend?");
					int spend = sc.nextInt();
					if((spend<=bal) && (spend>0)){
						
						int slot1 = ((int) (Math.random()*7+1));
						int slot2 = ((int) (Math.random()*7+1));
						int slot3 = ((int) (Math.random()*7+1));
						System.out.println(" ___________");
						System.out.println("| " + slot1 + " | " + slot2 + " | " + slot3 + " |");
						if((slot1==slot2) || (slot2==slot3) || (slot1==slot3)){
							bal = spend*2 + bal;
							System.out.println("Great you won! You are now at $" + bal);
							String choice1 = sc.nextLine();
						}
						else if ((slot1==slot2) && (slot2==slot3) && (slot1==slot3)){
							bal = spend*3 + bal;
							System.out.println("Great job! You now have $" + bal);
							String choice2 = sc.nextLine();
						}
						else {
							bal = bal - spend;
							System.out.println("Aw man you lost! You now have $" + bal);
							String choice3 = sc.nextLine();
							if(bal==0){
								System.out.println("You ran out of money...Its all gone :(");
								break;
							}
						}	
					}
					else{
						System.out.println("ThIs Is InVaLiD. pLeAsE tRy AgAiN");
						String choice4 = sc.nextLine();
						//This makes no sense pls help 
					}
				}
				else if(choice.equals("no") || choice.equals("No") || choice.equals("N") || choice.equals("n")){
					System.out.println("Sad to see you go. Please come back again1");
					x = 1;	
				}
				else {
					System.out.println("Sorry this answer is invalid. Please try again.");
				}
			}
	
	
}
}

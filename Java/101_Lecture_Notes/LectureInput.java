/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("💜Welcome to Bethica's Cafe!!!💙");
        System.out.println("here is the menu");
        System.out.println("1. 🧉fruit smoothie- $100.99");
        System.out.println("2. ☕️Matcha Mocha latte- $99.99");
        System.out.println("3. 🧁Blueberry muffin- $67.67");
        
        System.out.println("Who's order is this?");
        String name = sc.nextLine();
        System.out.println("How many Fruit smoothies would you like?");
        int item1 = sc.nextInt();
        System.out.println("How many Matcha Mocha lattes would you like?");
        int item2 = sc.nextInt();
        System.out.println("How many Blueberry Muffins would you like?");
        int item3 = sc.nextInt();
        
        double price1 = item1 * 100.99;
        double price2 = item2 * 99.99;
        double price3 = item3 *67.67;
        
        System.out.println("How much do you want to tip?");
        double tip = sc.nextDouble();
        
        double total = price1 + price2 + price3 + tip;
        
        System.out.println(name + "'s Receipt");
        System.out.println(item1 + " x Fruit smoothie=$" + price1);
        System.out.println(item2 + " x Matcha Mocha latte = $" + price2);
        System.out.println(item3 + " x Blueberry muffin = $" + price3);
        System.out.println("The Grand Total is -" + total);
        System.out.println("Thank you for coming!❤(ӦｖӦ｡)");
        
        
        
	}
}

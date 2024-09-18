package game;
import java.util.Scanner;
//import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {
    	
    	//new Hello().hello();

        Scanner scanner = new Scanner(System.in);
        //Random random = new Random();

        System.out.print("Are you a Warrior, Mage, or Dwarf? ");
        String choice = scanner.nextLine().toLowerCase();
        System.out.print("Choose a name for your hero: ");
        String name = scanner.nextLine();
        Character hero;

        if (choice.equals("warrior")) {
            hero = new Warrior(name);
        } else if (choice.equals("mage")) {
            hero = new Mage(name);
        } else if (choice.equals("dwarf")) {
            hero = new Dwarf(name);
        } else {
            System.out.println("Invalid. Try choosing between Warrior, Mage, or Dwarf.");
            scanner.close();
            return;
        }

        Orc orc = new Orc();

        while (hero.isAlive() && orc.isAlive()) {
            hero.printAttackOptions();
            System.out.print("What will you choose? (Type your choice as 1, 2 or 3): ");
            String attackChoice = scanner.nextLine();

            int damage = hero.attack(attackChoice);
            orc.takeDamage(damage);

            if (!orc.isAlive()) {
                System.out.println("Congratulations! The orc has been defeated. " + name + " gains 125XP!");
                break;
            } else {
                System.out.println("The orc's health is now " + orc.getHealth() + ".");
                System.out.println("Prepare for the orc's counterattack!");
            }

            int orcDamage = orc.attack();
            hero.takeDamage(orcDamage);

            if (!hero.isAlive()) {
                System.out.println(name + " has fallen in battle. Game over.");
                break;
            } else {
                System.out.println(name + "'s health is now " + hero.getHealth() + ".");
            }
        }

        scanner.close();
    }
}

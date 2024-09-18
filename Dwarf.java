package game;

class Dwarf implements Character {
    String name;
    int health;

    public Dwarf(String name) {
        this.name = name;
        this.health = 130; 
        System.out.println("You have chosen the path of the Dwarf " + name + ", may Thorin Oakenshield look over you.");
    }

    public int attack(String attackChoice) {
        if (attackChoice.equals("1")) {
            System.out.println("The dwarf " + name + " used Rune-etched Axe and magic was released!");
            return 30;
        } else if (attackChoice.equals("2")) {
            System.out.println("The dwarf " + name + " used Boulder Throw and the earth shudders by the impact!");
            return 20;
        } else if (attackChoice.equals("3")) {
            System.out.println("The dwarf " + name + " used THOR's Wrath and the god of thunder responds in all his might!");
            return 40;
        } else {
            return 0;
        }
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " takes " + damage + " damage. Remaining health: " + this.health);
    }

    public int getHealth() {
        return this.health;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

	@Override
	public void printAttackOptions() {
        System.out.println("Choose which attack you want to use:\n\n1) Rune-etched Axe\n2) Boulder Throw\n3) THOR's Wrath");		
	}
}

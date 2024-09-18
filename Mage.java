package game;

class Mage implements Character {
    String name;
    int health;

    public Mage(String name) {
        this.name = name;
        this.health = 100; 
        System.out.println("You have chosen the path of the Mage " + name + ", may Merlin look over you.");
    }

    public int attack(String attackChoice) {
        if (attackChoice.equals("1")) {
            System.out.println("The mage " + name + " used Fire Blast and blasts fire from their hands!");
            return 25;
        } else if (attackChoice.equals("2")) {
            System.out.println("The mage " + name + " used Ice Ball and shoots a ball of ice!");
            return 20;
        } else if (attackChoice.equals("3")) {
            System.out.println("The mage " + name + " used Thunder Bolt and thunder came down from the heavens!");
            return 35;
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
        System.out.println("Choose which attack you want to use:\n\n1) Fire Blast\n2) Ice Ball\n3) Thunder Bolt");
		
	}
}


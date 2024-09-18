package game;

import java.util.Random;

class Orc {
    int health;

    public Orc() {
        this.health = 150;
    }

    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(20) + 10; 
        System.out.println("The orc attacks and deals " + damage + " damage!");
        return damage;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println("The orc takes " + damage + " damage. Remaining health: " + this.health);
    }

    public int getHealth() {
        return this.health;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}

package game;

import java.util.ArrayList;
import java.util.List;

class Warrior implements Character {
    String name;
    int health;
    List<Attack> attacks;

    public Warrior(String name) {
        this.name = name;
        this.health = 120; 
        System.out.println("You have chosen the path of the Warrior " + name + ", may Kratos look over you.");
        this.attacks = new ArrayList<>();
        this.attacks.add(new Attack("Axe Swing", 30));
        this.attacks.add(new Attack("Fire Arrow", 20));
        this.attacks.add(new Attack("Fists of Fury", 15));
        this.attacks.add(new Attack("Spit", 1));
    }

    public int attack(String attackChoice) {
       var attack = attacks.get(Integer.parseInt(attackChoice) - 1);
       System.out.println("Attacking using " + attack.name);
       return attack.damage;
    }

    public void takeDamage(int damage) {
        this.health = Math.max(this.health - damage, 0);
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
        System.out.println("Choose which attack you want to use:\n\n ");
        for(int i = 0; i < attacks.size(); i ++) {
        	System.out.println(i + 1 + ")" + attacks.get(i).name);
        }
	}
}

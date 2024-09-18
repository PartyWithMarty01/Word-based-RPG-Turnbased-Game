package game;

public interface Character {
    int attack(String attackChoice);
    void takeDamage(int damage);
    int getHealth();
    boolean isAlive();
    void printAttackOptions();
}

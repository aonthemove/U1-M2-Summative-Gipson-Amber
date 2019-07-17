import com.sun.org.apache.xpath.internal.operations.String;

public class Warrior extends Players {
    int strength = 75;
    int health = 100;
    int stamina = 100;
    int speed = 50;
    int attackPower = 10;
    int sheildStrength = 100;

    public Warrior(String name, int strength, int health, int stamia, int speed, int attackpower) {
        super(name, strength, health, stamia, speed, attackpower);
    }
}



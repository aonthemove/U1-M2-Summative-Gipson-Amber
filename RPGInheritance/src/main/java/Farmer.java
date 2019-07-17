import com.sun.org.apache.xpath.internal.operations.String;

public class Farmer extends Players {
    int strength = 75;
    int health = 100;
    int stamina = 75;
    int speed = 10;
    int attackPower = 1;

    public void plow() {
        System.out.println("plowing");
    }
        public void harvest(){
            System.out.println("harvesting");
    }

    public Farmer(String name, int strength, int health, int stamia, int speed, int attackpower) {
        super(name, strength, health, stamia, speed, attackpower);
    }
}

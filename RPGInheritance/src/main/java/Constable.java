import com.sun.org.apache.xpath.internal.operations.String;

public class Constable  extends Players{
    public  String jurisdiction;
    int strength = 60;
    int health = 100;
    int stamina = 60;
    int speed = 20;
    int attackPower = 5;
    public Constable(String name, int strength, int health, int stamia, int speed, int attackpower, String jurisdiction) {
        super (name, strength, health, stamia, speed, attackpower );
    }

    public void arrest() {
        System.out.println("arresting");
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;


    }
}



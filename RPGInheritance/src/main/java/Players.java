
import com.sun.org.apache.xpath.internal.operations.String;



        public class Players {

            private String name;
            private int strength;
            private int health;
            private int stamia;
            private int speed;
            private int attackpower;

            public void run() {
                System.out.println("turbo");
            }

            public void Attack() {
                System.out.println("punch");
            }

            public void heal() {
                System.out.println("healing");
            }

            public void decreaseHealth() {
                System.out.println("ouch");
            }

            public void increaseStamina() {

                System.out.println("GREAT!");
            }

            public void decreaseStamina() {
                System.out.println("oh no");

            }


            public Players(String name, int strength, int health, int stamia, int speed, int attackpower) {
                this.name = name;
                this.strength = strength;
                this.health = health;
                this.stamia = stamia;
                this.speed = speed;
                this.attackpower = attackpower;


            }

        }

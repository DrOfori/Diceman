package Dice;
    import java.util.Random;

    public class Dice2 {
        private String[] activities;  // de mulige udfald
        private Random random;        // bruges til at generere tilfældige tal

        // Konstruktør
        public Dice2(String[] = activities) {
            this.activities = activities;
            this.random = new Random();
        }

        // Metode til at rulle terningen én gang
        public String roll() {
            int roll = random.nextInt(activities.length);
            return activities[roll];
        }

    }


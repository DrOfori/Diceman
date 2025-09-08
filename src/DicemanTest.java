package PACKAGE_NAME;

public class DicemanTest {
        public static void main(String[] args) {
            // Test Dice class
            Dice dice = new Dice(1, 2, 3, 4, 5, 6);
            System.out.println("Rolling the dice 5 times:");
            for (int i = 0; i < 5; i++) {
                int result = dice.rolldice();
                System.out.println("Roll " + (i + 1) + ": " + result);
            }

            // Test Diceman class
            Diceman diceman = new Diceman("Alex", 3);
            System.out.println("\nTesting Diceman:");
            System.out.println("Name: " + diceman.getName());
            System.out.println("Number of activities: " + diceman.getNumberOfActivities());

            // Placeholder for doAction() da det ikke er blevet implementeret
            System.out.println("Calling doAction() (currently does nothing)...");
            diceman.doAction();
        }
    }

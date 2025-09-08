package PACKAGE_NAME.Dice;

public class Diceman {
    private String name;
    private int numberOfActivities;

    public Diceman(String name, int numberOfActivities) {
        this.name = name;
        this.numberOfActivities = numberOfActivities;
    }

    public String getName() {
        return name;
    }

    public void doAction() {
        System.out.println(this.name + " just got out of bed. He doesn't know what to do, so he'll roll a dice to help him decide");
        while (numberOfActivities < 5) {
            numberOfActivities++;
            System.out.print(numberOfActivities + ": ");
            if (Dice.rolldice() == 1) {
                System.out.println(this.name + " gets up to eat a meal.");
            } else
            if (Dice.rolldice() == 2) {
                System.out.println(this.name + " sits down to study.");
            } else
            if (Dice.rolldice() == 3) {
                System.out.println(this.name + " goes out for a swim.");
            }  else
            if (Dice.rolldice() == 4) {
                System.out.println(this.name + " goes to the lake to try to catch some fish.");
            } else
            if (Dice.rolldice() == 5) {
                System.out.println(this.name + " calls his mom.");
            } else {
                System.out.println(this.name + " gets back in bed.");
            }

        }
        System.out.println("The day is over. " + this.name + " has gone to sleep and will start again tomorrow");
    }

}


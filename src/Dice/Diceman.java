package PACKAGE_NAME.Dice;

public class Diceman {
    private String name;
    private int numberOfActivities;

    public Diceman(String name, int numberOfActivities) {
        this.name = name;
        this.numberOfActivities = numberOfActivities;
    }

    public void doAction() {
        while (numberOfActivities <= 5) {
            System.out.println("do an action");
            numberOfActivities++;
        }
    }
}


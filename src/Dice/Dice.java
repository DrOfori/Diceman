package Dice;

import java.util.Random;

public class Dice {
     int act1;
     int act2;
     int act3;
     int act4;
     int act5;
     int act6;

    public Dice(int act1, int act2, int act3, int act4, int act5, int act6) {
        this.act1 = act1;
        this.act2 = act2;
        this.act3 = act3;
        this.act4 = act4;
        this.act5 = act5;
        this.act6 = act6;
    }

       public int rolldice() {
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
            return roll;
        }

}

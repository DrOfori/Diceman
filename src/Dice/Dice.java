package PACKAGE_NAME.Dice;

import java.util.Random;

public class Dice {
    /* int face1;
     int face2;
     int face3;
     int face4;
     int face5;
     int face6;

    public Dice(int face1, int face2, int face3, int face4, int face5, int face6) {
        this.face1 = face1;
        this.face2 = face2;
        this.face3 = face3;
        this.face4 = face4;
        this.face5 = face5;
        this.face6 = face6;
    } */


       public static int rollDice() {
           Random rand = new Random();
           int roll = 0;
           roll = rand.nextInt(6) + 1;
           return roll;
       }


}

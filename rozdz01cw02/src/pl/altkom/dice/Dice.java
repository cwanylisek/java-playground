package pl.altkom.dice;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rollGenerator = new Random();
        System.out.println("Rzut kostka " + (rollGenerator.nextInt(6) + 1));
    }
}

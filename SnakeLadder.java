package com.bridgelabz.snakeladder;

public class SnakeLadder {
	 //UC1= Snake and Ladder game played with single player at start position 0
   static  byte playerPosition = 0;
    static byte diceRoll;
    static byte SnakeArray[] = {54, 90, 99};
    static byte LadderArray[] = {9, 40, 67};
public static void main(String args[]) {
    System.out.println("Starting Position of the Player = " + playerPosition);

    //UC2=The Player rolls the die to get a number between 1 to 6.
    System.out.println();
    
    for (int playerPosition = 1; playerPosition <= 100; playerPosition++) {
        diceRoll = (byte) ((byte) (Math.random() * 6));
//UC3 player checks option
    System.out.println("Dice Number =" + " " + diceRoll);
        System.out.println("Dice Number =" + " " + diceRoll);

}
        playerPosition = (byte) (playerPosition + diceRoll);
        playerPosition = (byte) (playerPosition - 1);

        System.out.println("Current Position =" + " " + playerPosition);
//UC4 player wins the game
        if (playerPosition == 100) {
            System.out.println();
            System.out.println("CONGRATULATION!! YOU WON THE GAME.");
        }
        if (diceRoll == 0) {

            playerPosition = (byte) (playerPosition - diceRoll);

            System.out.println("You have to stay on the same position!!");
        }

        if (playerPosition == SnakeArray[0]) {
            playerPosition = 19;

            System.out.println("IT'S A SNAKE.");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition == SnakeArray[1]) {
            playerPosition = 48;

            System.out.println("IT'S A SNAKE.");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition == SnakeArray[2]) {
            playerPosition = 77;

            System.out.println("IT'S A SNAKE.");
            System.out.println("Now, You are at " + playerPosition + " position.");

        } else if (playerPosition == LadderArray[0]) {
            playerPosition = 34;

            System.out.println("YOU GOT A LADDER.");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition == LadderArray[1]) {
            playerPosition = 64;

            System.out.println("YOU GOT A LADDER.");
            System.out.println("You are at " + playerPosition + " position.");

        } else if (playerPosition == LadderArray[2]) {
            playerPosition = 86;

            System.out.println("YOU GOT A LADDER.");
            System.out.println("You are at " + playerPosition + " position.");
        }
    }

}

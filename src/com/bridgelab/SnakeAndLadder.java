package com.bridgelab;

public class SnakeAndLadder {
    public static void main(String[] args) {
        //UC6 - Report the number of times the dice was played to win the game and also the position after every die role.
        System.out.println("Welcome to the Snake and Ladder Program by using Java");

        int position = 0;

        for (int i=0; position < 100 ; i++) {
            int die = (int) (Math.random() * 6 + 1);
            int option = (int) (Math.random() * 3);

            System.out.println("the output of the die is :: " + die);

            switch (option) {
                case 1:
                    System.out.println("Sorry you got 'No Play'");
                    position += 0;
                    break;
                case 2:
                    System.out.println("Hoo.. you got an 'Ladder'");
                    position += die;
                    if (position > 100){
                        position = 100;
                        System.out.println("Count of the dice was played to win the game :: "+i);
                    }
                    break;
                default:
                    System.out.println("Noo... you got an 'Snake' ");
                    position -= die;
                    if (position < 0) {
                        position = 0;
                    }
                    break;
            }
            System.out.println("Payer starts at position :: " + position);
            if (position == 100){
                System.out.println("Wow You won the game ....");
            }
        }
    }
}

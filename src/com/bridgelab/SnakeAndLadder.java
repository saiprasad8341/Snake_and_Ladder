package com.bridgelab;

public class SnakeAndLadder {
    public static void main(String[] args) {
        //UC3 - The player then checking for an option (No play, Ladder, Snake).
        System.out.println("Welcome to the Snake and Ladder Program by using Java");

        int position = 0;
        int die = (int)(Math.random() * 6 + 1);
        int option = (int)(Math.random() * 3);

        System.out.println("the output of the die is :: "+die);

        switch (option){
            case 1 :
                System.out.println("Sorry you got 'No Play'");
                position += 0;
                break;
            case 2 :
                System.out.println("Wow you got an 'Ladder'");
                position += die;
                break;
            default:
                System.out.println("No... you got an 'Snake' ");
                position -= die;
                if (position < 0){
                    position = 0;
                }
                break;
        }

        System.out.println("Payer starts at position :: "+ position );

    }
}

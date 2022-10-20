package com.bridgelab;

public class SnakeAndLadder {
    public static void main(String[] args) {
        //UC2 - The Player rolls the die to get a number between 1 and 6.
        System.out.println("Welcome to the Snake and Ladder Program by using Java");

        int position = 0;
        int die = (int)(Math.random() * 6 + 1);

        System.out.println("Payer starts at "+ position + " position");

        System.out.println("the output of the die is :: "+die);

    }
}

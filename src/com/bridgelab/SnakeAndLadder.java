package com.bridgelab;

public class SnakeAndLadder {
    public static int postion(int option , int position, int die, int roll){
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
                    System.out.println("Count of the dice was played to win the game :: "+roll);
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
        return position;
    }
    public static void main(String[] args) {
        //UC7 - Play the game with 2 player. In this case if a payer gets a Ladder then plays again.
        System.out.println("Welcome to the Snake and Ladder Program by using Java");

        int player1_position = 0;
        int player2_position = 0;
        boolean game_continue = true;

        for (int i=0; game_continue ; i++) {
            int player1_die = (int) (Math.random() * 6 + 1);
            int player2_die = (int) (Math.random() * 6 + 1);
            int player1_option = (int) (Math.random() * 3);
            int player2_option = (int) (Math.random() * 3);

            System.out.println("the output of the Player1 die is :: " + player1_die);
            System.out.println("the output of the Player2 die is :: " + player2_die);

            player1_position = postion(player1_option,player1_position,player1_die,i);
            System.out.println("Payer1 at position :: " + player1_position);
            player2_position = postion(player2_option,player2_position,player2_die,i);
            System.out.println("Payer2 at position :: " + player2_position);
            if (player1_position == 100){
                System.out.println("Wow Player1 won the game.....");
                game_continue=false;
            } else if(player2_position == 100){
                System.out.println("Wow Player2 won the game.....");
                game_continue=false;
            }
        }
    }
}

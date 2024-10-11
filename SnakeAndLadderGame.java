// package SnakeAndLadderGame;

import java.util.Scanner;

public class SnakeAndLadderGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int playerDiceNumber = 0, playerScore = 0, playerPreScore = 0;
        int computerDiceNumber = 0, computerScore = 0, computerPreScore = 0;

        System.out.println("Game started ..!");

        int i = 1;
        while (i > 0) {
            playerDiceNumber = generateRandomNumber(6);
            computerDiceNumber = generateRandomNumber(6);

            System.out.println("player dice number   :: " + playerDiceNumber);
            System.out.println("computer dice number :: " + computerDiceNumber);

            // -------------------------------------------------------\\
            if (playerDiceNumber == 1) {
                playerScore -= 6;
            } else if (playerDiceNumber == 6) {
                playerScore += (12);
            } else {
                playerScore += playerDiceNumber;
            }
            // -------------------------------------------------------\\

            // -------------------------------------------------------\\

            if (computerDiceNumber == 1) {
                computerScore -= 6;
            } else if (computerDiceNumber == 6) {
                computerScore += (12);
            } else {
                computerScore += computerDiceNumber;
            }
            // -------------------------------------------------------\\

            // -------------------------------------------------------\\
            if (playerScore < 0) {
                playerScore = 0;
            }
            if (computerScore < 0) {
                computerScore = 0;
            }
            // -------------------------------------------------------\\

            graphics(playerScore, computerScore);

            // -------------------------------------------------------\\

            if (playerScore == 100) {
                System.out.println("You win the game ..!");

                System.out.println("[winner] playerScore  :: " + playerScore);
                System.out.println("[......] computerScore:: " + computerScore);
                break;
            }
            if (computerScore == 100) {
                System.out.println("Computer win the game ..!");
                System.out.println("[winner] playerScore  :: " + playerScore);
                System.out.println("[......] computerScore:: " + computerScore);
                break;
            }
            // -------------------------------------------------------\\

            // -------------------------------------------------------\\

            if (playerScore > 100) {
                playerScore = playerPreScore;
            }
            if (computerScore > 100) {
                computerScore = computerPreScore;
            }
            // -------------------------------------------------------\\

            System.out.println("playerScore          :: " + playerScore);
            System.out.println("computerScore        :: " + computerScore);
            playerPreScore = playerScore;
            computerPreScore = computerScore;
            System.out.println("-----------------------------------:");
            i = sc.nextInt();
        }
        System.out.println("pgm ended..!");
    }

    static int generateRandomNumber(int num) {
        return ((int) (Math.random() * 10) % 6) + 1;
    }

    static void graphics(int playerScore,int computerScore) {
         
        for (int i = 1; i <=100; i++) {

            if(i==playerScore){
                System.out.print("[ * ]");   
            }
            else  if(i==computerScore){
                System.out.print("[ + ]");   
            }
            else  if(computerScore==playerScore){
                System.out.print("[ +,* ]");   
            }
            else {
                
                System.out.print("[   ]");   
            }
            if (i%10==0) {
                System.out.println();
                
            }
        }
    }
}

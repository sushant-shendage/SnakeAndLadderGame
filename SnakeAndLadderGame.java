// package SnakeAndLadderGame;

import java.util.Scanner;

public class SnakeAndLadderGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int gameLoop=0;
        do{

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

            
            // -------------------------------------------------------\\
            
            
            // -------------------------------------------------------\\
            
            if (playerScore > 100) {
                playerScore = playerPreScore;
            }
            if (computerScore > 100) {
                computerScore = computerPreScore;
            }
            // -------------------------------------------------------\\
            
            graphics(playerScore, computerScore);


            System.out.println();
            System.out.print("Player   [+]::");
            status(playerScore);
    
            System.out.print("Computer [-]::");
            status(computerScore);
            System.out.println();





            if (playerScore == 100) {
                System.out.println("You win the game ..!");

                System.out.println("[winner] playerPosition  :: " + playerScore);
                System.out.println("[......] computerPosition:: " + computerScore);
                break;
            }
            if (computerScore == 100) {
                System.out.println("[......] playerPosition  :: " + playerScore);
                System.out.println("[winner] computerPosition:: " + computerScore);
                System.out.println("Computer win the game ..!");
                break;
            }
            // -------------------------------------------------------\\


            System.out.println("playerPosition          :: " + playerScore);
            System.out.println("computerPosition        :: " + computerScore);
            playerPreScore = playerScore;
            computerPreScore = computerScore;
            System.out.println("--------------------------------------------------------------------------");

            i = sc.nextInt();
        }
System.out.println("game over..!");
System.out.println();
        System.out.println("Enter 1 to play agin and 0 to exit ");

       
        gameLoop=sc.nextInt();
    } while(gameLoop!=0);
        System.out.println("pgm ended..!");
    }

    static int generateRandomNumber(int num) {
        return ((int) (Math.random() * 10) % 6) + 1;
    }

    static void graphics(int playerScore,int computerScore) {

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("            Destination");
         
        
        for (int i = 100; i >0; i--) {


           

           if (i==playerScore || i==computerScore ) {
            if(playerScore!=computerScore){
                
                if(i==playerScore){
                System.out.print("[ \033[31m*\u001b[0m   ]");   
            }
            else  if(i==computerScore){
                System.out.print("[ \033[32m+\u001b[0m   ]");   
            }
        }
            else   {
                System.out.print("[ \033[32m+\u001b[0m,\033[31m*\u001b[0m ]");   
            }
           }
            else {
                
                System.out.print("[     ]");   
            }


        
           
        
        if (i%10==0) {
                System.out.println();
                
            }
        }
        System.out.println("<--Start");
        System.out.println("--------------------------------------------------------------------------");


    }

    static void status(int num){
        int option=num/10;
 switch (option) {
    case 0:
        System.out.println("[ \033[33m=                   \033[37m]");
        break;
        case 1:
        System.out.println("[ \033[33m= =                 \033[37m]");
        break;
        
        case 2:
        System.out.println("[ \033[33m= = =               \033[37m]");
        break;
        
        case 3:
        System.out.println("[ \033[33m= = = =             \033[37m]");
        break;
        
        case 4:
        System.out.println("[ \033[33m= = = = =           \033[37m]");
        break;
        
        case 5:
        System.out.println("[ \033[33m= = = = = =         \033[37m]");
        break;
        
        case 6:
        System.out.println("[ \033[33m= = = = = = =       \033[37m]");
        break;
        
        case 7:
        System.out.println("[ \033[33m= = = = = = = =     \033[37m]");
        break;
        case 8:
        System.out.println("[ \033[33m= = = = = = = = =   \033[37m]");
        break;
        
        case 9:
        System.out.println("[ \033[33m= = = = = = = = = = \033[37m]");
        break;
     
 }
    }
}

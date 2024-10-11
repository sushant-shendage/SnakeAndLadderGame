// package SnakeAndLadderGame;

import java.util.Scanner;

public class SnakeAndLadderGame {
    static Scanner sc=new Scanner(System.in);
  
   

public static void main(String[] args) {

     int playerDiceNumber=0;
     int computerDiceNumber=0;

    
    System.out.println("Game started ..!");

    // while(true){
         playerDiceNumber=generateRandomNumber(6);
         computerDiceNumber=generateRandomNumber(6);
System.out.println("player dice number ::"+playerDiceNumber);
System.out.println("computer dice number ::"+computerDiceNumber);
    //     break;
    // }
    System.out.println("pgm ended..!");
}    

static int generateRandomNumber(int num)
{
     return ((int)(Math.random()*10)%6)+1;
}
}

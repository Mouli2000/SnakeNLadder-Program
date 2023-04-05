package com.bridgelabz.snakenladder;

import java.util.Random;

public class SnakeNLadder {

	public static void main(String[] args) {
		
		int player = 2;
		int position1 = 0;
		int position2 = 0;
		if(player == 2 && position1 == 0 && position2 == 0) {
			System.out.println("Players Number : "+player);
			System.out.println("Player 1 Starting Position : "+position1);
			System.out.println("Player 2 Starting Position : "+position2);
			Random random = new Random();
			while(position1<=100 || position2<=100) {
				int die1 = random.nextInt(6)+1;
				System.out.println("\nPlayer 1 Die Number : "+die1);
				int options1 = random.nextInt(3);
				if(position1 < 100) {
					switch(options1){
					case 1:	position1 = position1 + die1;
							System.out.println("Player 1 Got Ladder !!!");
							if(options1 == 1) {
								die1 = random.nextInt(6)+1;
								position1 = position1 + die1;
							}
							break;
					case 2: position1 = position1 - die1;
							System.out.println("Player 1 Got Snake !!!");
							break;
					default: System.out.println("Player 1 Has No Play..."); 
							 position1 = position1;
					}
					if(position1 > 100) {position1 = position1 - die1;}
					System.out.println("Player Position : "+position1);
					if(position1 == 100) {
						System.out.println("\nPlayer 1 Won The Game !!!");
						break;
					}
					else if(position1 < 0) {
						position1 = 0;
						System.out.println("Player 1 Position : "+position1);
					}
				}
				int die2 = random.nextInt(6)+1;
				System.out.println("\nPlayer 2 Die Number : "+die2);
				int options2 = random.nextInt(3);
				if(position2 < 100) {
					switch(options2){
					case 1: position2 = position2 + die2;
							System.out.println("Player 2 Got Ladder !!!");
							if(options2 == 1) {
								die2 = random.nextInt(6)+1;
								position2 = position2 + die2;
							}
							break;
					case 2: position2 = position2 - die2;
							System.out.println("Player 2 Got Snake !!!");
							break;
					default: System.out.println("Player 2 Has No Play..."); 
							 position2 = position2;
					}
					if(position2 > 100) {position2 = position2 - die2;}
					System.out.println("Player 2 Position : "+position2);
					if(position2 == 100) {
						System.out.println("\nPlayer 2 Won The Game !!!");
						break;
					}
					else if(position2 < 0) {
						position2 = 0;
						System.out.println("Player 2 Position : "+position2);
					}
				}
			}
		}
		else
			System.out.println("This Game Will Be Played With Two Players...");
	}
}

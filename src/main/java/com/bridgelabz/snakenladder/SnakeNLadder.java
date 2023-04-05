package com.bridgelabz.snakenladder;

import java.util.Random;

public class SnakeNLadder {
	public static void main(String[] args) {
		
		int player = 1;
		int position = 0;
		int dieRolls = 0;
		if(player == 1 && position == 0) {
			System.out.println("Player Number : "+player);
			System.out.println("Starting Position : "+position);
		}
		else
			System.out.println("This Game Will Be Played With Single Player...");
		Random random = new Random();
		for(int i=0; position<=100; i++) {
			dieRolls++;
			int die = random.nextInt(6)+1;
			System.out.println("\nDie Number : "+die);
			int options = random.nextInt(3);
			if(position < 100) {
				switch(options){
				case 1: position = position + die;
						System.out.println("Player Got Ladder !!!");
						break;
				case 2: position = position - die;
						System.out.println("Player Got Snake !!!");
						break;
				default: System.out.println("No Play..."); 
						 position = position;
				}
				if(position > 100) {position = position - die;}
				System.out.println("Player Position : "+position);
				if(position == 100) {
					System.out.println("\nPlayer Won The Game");
					break;
				}
				else if(position < 0) {
					position = 0;
					System.out.println("Player Psoition : "+position);
				}
			}
		}
		System.out.println("\nDice Rolled : "+dieRolls);
	}
}

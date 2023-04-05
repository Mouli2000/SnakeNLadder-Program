package com.bridgelabz.snakenladder;

import java.util.Random;

public class SnakeNLadder {

	public static void main(String[] args) {
		
		System.out.print("Enter Player Number : ");
		int player = 1;
		int position = 0;
		if(player == 1 && position == 0) {
			System.out.println("Player Number : "+player);
			System.out.println("Starting Position : "+position);
		}
		else
			System.out.println("This Game Will Be Played With Single Player...");
		Random random = new Random();
		int die = random.nextInt(6)+1;
		System.out.println("Die Number : "+die);
	}
}

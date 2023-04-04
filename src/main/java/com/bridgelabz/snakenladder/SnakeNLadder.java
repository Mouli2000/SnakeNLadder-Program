package com.bridgelabz.snakenladder;

import java.util.Scanner;

public class SnakeNLadder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Player Number : ");
		int player = scan.nextInt();
		int position = 0;
		if(player == 1 && position == 0) {
			System.out.println("Player Number : "+player);
			System.out.println("Starting Position : "+position);
		}
		else
			System.out.println("This Game Will Be Played With Single Player...");
	}
}

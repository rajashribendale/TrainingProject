package SwitchCase;

import java.util.Scanner;

public class play {

	public void m() {
		System.out.println("choose game name football or cricket");
		Scanner sc = new Scanner(System.in);
		String game = sc.next();

//		String game = "cricket";

		switch (game) {
		case "Cricket":

			System.out.println("playing cricket");
			m1();
			break;
		case "football":
			System.out.println("playing football");
			m2();

			break;

		default:
			System.out.println("nothing to play");
		}
	}

	public static void m1() {
		int player = 12;

		while (player >= 1) { // 12>=1 true inside loop 0>=1 false end game
			System.out.println("player go to play cricket one by one  " + player);

			player--;
			System.out.println("after out one player" + player);

		}
		System.out.println("end game");

	}

	public static void m2() {
		int p = 11;
		{
			if (p == 11 && p != 11)
				System.out.println("all player plays football");

		}
		{
			System.out.println("can not played this ganme");
		}
	}

	public static void main(String[] args) {

		play p = new play();
		p.m();

	}
}

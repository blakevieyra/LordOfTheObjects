package com.skilldistillery.entities;

import java.util.Random;
import java.util.Scanner;

public class TavernCommoner extends Character {

	public void interact(Scanner keyboard, Witcher witcher) {
		System.out.println(
				"Tavern Commnoner: Hello, Witcher. We don't see many of your kind around these parts. Care for a game of dice poker?");
		System.out.println("Hint: Reply with 'yes' or 'no'");
		String response = keyboard.nextLine();
		System.out.println(response);

		while (!response.equalsIgnoreCase("yes") || !response.equalsIgnoreCase("no")) {
			switch (response) {
			case "yes":
				System.out.println(
						"Tavern Commnoner: I'll bet this chest armor I got from the smithy for one of your fancy health potions.");
				System.out.println(
						"Tavern Commnoner: Let's see if you have any luck running through that black blood of yours.");
				int witcherRoll = witcher.playDice();
				System.out.println("You rolled " + witcherRoll);
				System.out.println("Tavern Commnoner: Nice roll, Witcher. Let's see if it does you any good.");
				int commonerRoll = playDice();
				System.out.println("The Tavern Commoner rolled " + commonerRoll);
				
				if (witcherRoll > commonerRoll) {
					System.out.println("Tavern Commoner: Ahhhh, what the hell. Looks like you have some luck in those"
							+ " young bones of your after all, Witcher. Take this silly armor. I don't know what to do with it anyways.");
					witcher.increaseArmor(1);
					witcher.addItem(new Armor("Leather Chest Armor", "Metal studded chest armor", 1));
				} else if (witcherRoll < commonerRoll) {
					System.out.println("Tavern Commoner: Looks like I'll be taking that potion, Witcher!"
							+ " My little girl is bedridden because of some weird scratch she got in the woods last week. I'll put it to good use.");
					witcher.giveHealthPotion();
				} else {
					System.out.println("Tavern Commoner: Ahhhh, what the hell. Looks like we're even, "
							+ "Witcher. Take this silly armor. I don't know what to do with it anyways.");
					witcher.addItem(new Armor("Leather Chest Armor", "Metal studded chest armor", 1));
				}
				return;
			case "no":
				System.out.println("Tavern Commoner: Pfft. Most say Witchers aren't cowards. Looks like i found one in the bunch.");
				break;
			default:
				System.out.println("Tavern Commoner: Hmm. I don't know that tongue. Are casting a fancy Witcher spell on me?");
				System.out.println("Hint: Reply with 'yes' or 'no'");
				response = keyboard.nextLine();
				break;
			}
		}
	}

	public int playDice() {
		// There are 5 dice that all range from 1 - 6
		Random rand = new Random();
		return rand.nextInt(26) + 5;
	}

	@Override
	public void heal() {
		// Do nothing. Commoner won't fight or heal.
	}

}

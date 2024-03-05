package com.skilldistillery.app;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.skilldistillery.entities.Armor;
import com.skilldistillery.entities.Banshee;
import com.skilldistillery.entities.Monster;
import com.skilldistillery.entities.MonsterTrophy;
import com.skilldistillery.entities.TavernCommoner;
import com.skilldistillery.entities.Vampire;
import com.skilldistillery.entities.Werewolf;
import com.skilldistillery.entities.Witcher;

public class LordOfTheObjectsApp {

	Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {

		LordOfTheObjectsApp app = new LordOfTheObjectsApp();
		app.run();

	}

	public void run() throws InterruptedException {
		Witcher cataline = new Witcher();

		System.out.println("Welcome to the Witcher game. You are a witcher named Cataline and you are from the school"
				+ " of the Viper.\nYou are walking down the halls of your academy and you are stopped by your mentor.");
		System.out.println(
				"Isabella: A Banshee is terrorizing the village of Vengerberg. Retrieve the head of a Banshee to complete your Witcher training. Take this map.");
		System.out.println("Cataline: I accept.\nShe starts her adventure right away");
		
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);

		Werewolf werewolf = new Werewolf("Werewolf");
		System.out.println(
				"While heading to Novigrad, Cataline finds herself in wilds outside of Cintra. A werewolf suprise attacks her in the woods.");
		battle(werewolf, cataline);
		System.out.println();
		System.out.println();

		if (cataline.isAlive()) {
			System.out.println(
					"After a long struggle fighting this savage beast, Cataline walks away with its fang draped around her neck.");
		} else {
			System.out.println(
					"Cataline fought hard and with all her might, but the werewolf was too much to take on her own. She was defeated.");
			return;
		}
		cataline.rest();
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		
		System.out.println("Cataline now heads to Novigrad to hit the tavern, maybe get an ale, and a good night's sleep.");
		
		TimeUnit.SECONDS.sleep(10);
		System.out.println();
		System.out.println();
		TavernCommoner lawrence = new TavernCommoner();
		lawrence.interact(keyboard, cataline);
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		
		System.out.println("After Cataline gets a good night's rest, Cataline leaves the tavern and sees a bounty board on her way out of town.");
		System.out.println("The bounty was posted by the local blacksmith to kill or drive away a vampire that is squatting in his smithy.");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Cataline decides she wants the wares as a reward before tracking down the Banshee, so she hunts down the vampire");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Cataline goes around to the back of the smithy, finds a window slightly ajar, and climbs through.");
		System.out.println("As she lands, she sees the vampire feeding on the blacksmith's assistant.");
		System.out.println("Vampire: WHY DO YOU MORTALS ALWAYS INTERRUPT MY FEEDING!!?!?!?!");
		TimeUnit.SECONDS.sleep(10);
		System.out.println();
		System.out.println();
		
		Vampire vampire = new Vampire("Vampire");
		battle(vampire, cataline);
		System.out.println();
		System.out.println();
		
		if (cataline.isAlive()) {
			System.out.println(
					"The vampire tore, scratched, and bit through her armor, but she succeeded in taking down the vile creature.");
		} else {
			System.out.println(
					"Cataline fought hard and with all her might, but the vampire was too much to take on her own. She was defeated.");
			return;
		}
		cataline.rest();
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		
		System.out.println("Cataline delivers the heart of the vampire to the blacksmith, and he can't help but jump up and down with glee.");
		System.out.println("She informs him that his assistant was a casualty of the vampire's feeding. He seems sad, but almost unaffected.");
		TimeUnit.SECONDS.sleep(10);
		System.out.println();
		System.out.println();
		System.out.println("Blacksmith: Here is a new shiny set of leather armor I made before I was driven out of my smithy.");
		System.out.println("The blacksmith hands her some metal studded bracers, boots, and pants.");
		TimeUnit.SECONDS.sleep(10);
		cataline.increaseArmor(3);
		cataline.addItem(new Armor("Leather Bracers", "Metal studded wrist armor", 1));
		cataline.addItem(new Armor("Leather Boots", "Metal studded foot armor", 1));
		cataline.addItem(new Armor("Leather Pants", "Metal studded leg armor", 1));
		
		System.out.println("As Cataline is leaving Novigrad with her new digs, she notices there is a bounty on the Banshee she was tasked to hunt.");
		System.out.println("She almost jumps out of her new boots when she reads the reward for the Banshee.");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("It has taken over a noble's castle in Vengerberg, and the noble is offering chests of gold to rid this awful screaming creature from his home.");
		System.out.println("As Cataline heads east to Vengerberg, she finally approaches the castle after a long journey on her horse.");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Cataline notices the drawbridge is still down from the initial takeover and escape of the nobles.");
		System.out.println("She rides her horse all the way up to the front gate and ties her horse to a post.");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("She can hear the Banshee's wailing all the way outside of those thick stone walls. It makes a shiver run down her spine.");
		System.out.println("She walks into the abandoned castle, and follows the Banshees screams all the way down to the cellar.");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("She notices all of the bottles of wine and other spirits have been shattered by the Banshee's piercing howls.");
		System.out.println("Cataline, new to this profession, unknowingly stepped on some broken glass and alerted the Banshee.");
		
		Banshee banshee = new Banshee("Banshee");
		battle(banshee, cataline);
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		
		if (cataline.isAlive()) {
			System.out.println(
					"There is blood dripping from Cataline's ears all the way down her chest armor. The relentless screams have her ears ringing in horror.");
			System.out.println("However, she made it out of there with her life and the head of the Banshee.");
		} else {
			System.out.println(
					"Cataline fought hard and with all her might, but the banshee was too much to take on her own. She was defeated.");
			return;
		}
		cataline.rest();
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		
		MonsterTrophy bansheeHead = new MonsterTrophy("Banshee head", "An ethereal head", "Banshee", "Make the head scream");
		cataline.addItem(bansheeHead);
		
		System.out.println("The noble heard all of the commotion, and greeted Cataline at the end of the drawbridge after her decisive victory.");
		System.out.println("The noble was sobbing tears of joy at the visage of the bloody Witcher.");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Noble: My home! My home! You've saved my home from the awful creature. You have my utmost thanks and praise.");
		System.out.println("Cataline: The creature needed to be put down. Will you send my chests of gold to the academy of the Viper?");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Yes, yes, mad'am! I will have my guards deliver it as soon as we reenter the keep.");
		
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Cataline rides for days on the lonely trail to make it to the Viper academy where she started this journey.");
		System.out.println("She comes home to a quiet, but warm welcome by the new recruits training in the grounds.");
		System.out.println("She walks the echoing halls to locate her mentor, Isabella, and deliver this gut wrenching head.");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("After about 10 minutes of searching she finds Isabella reading a book in the keep's library. She always was a book worm.");
		System.out.println("Cataline startles Isabella by placing the head right in front of her book that she seemed so lost in.");
		System.out.println("Isabella: Well done, my child! You are now welcome as a full fledged Witcher in the eyes of the academy!!");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Cataline: Thank you ma'am. It was occupying a noble's castle by the time I found it, and he is paying in chests of gold.");
		System.out.println("Isabella: You have brought this school much honor and glory. Thank you for your efforts. I am proud to call you my apprentice.");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(10);
		
		System.out.println("Congratulations! You have earned Cataline much honor and glory, and helped her on her journey to becoming a Witcher!");
		System.out.println("Thank you for playing our game, and see you next time!");
	}

	public void battle(Monster enemy, Witcher cataline) {
		while (cataline.isAlive() && enemy.isAlive()) {
			enemy.attack(cataline);
			cataline.action(keyboard, enemy);
		}
		keyboard.nextLine();
	}

}

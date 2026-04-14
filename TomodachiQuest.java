import java.util.Scanner;
import java.util.Random;

public class Main
{
	public void timeDelay(int seconds) {
	    try {
            Thread.sleep(seconds * 1000);
        } 
        catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
	}
	
	public int calculatePunchDMG() {
	    int rollHit;
	    int rollCrit;
	    int rollDMG;
	    
	    Random rand = new Random();
	    
	    rollHit = rand.nextInt(11);
	    if (rollHit == 0) {
	        System.out.println("The attack missed!");
	        return rollDMG = 0;
	    }
	    
	    else {
	        rollDMG = rand.nextInt(11) + 80;
	    
	        rollCrit = rand.nextInt(6);
	        if (rollCrit == 1) {
	            System.out.println("A critical hit!");
	            rollDMG = rollDMG + 100;
	        }
	        
	        System.out.println("It did " + rollDMG + " damage!");
	    }
	    
	    return rollDMG;
	}
	
	public int calculateKickDMG() {
	    int rollHit;
	    int rollCrit;
	    int rollDMG;
	    
	    Random rand = new Random();
	    
	    rollHit = rand.nextInt(3);
	    if (rollHit < 2) {
	        System.out.println("The attack missed!");
	        return rollDMG = 0;
	    }
	    
	    else {
	        rollDMG = rand.nextInt(11) + 60;
	    
	        rollCrit = rand.nextInt(4);
	        if (rollCrit == 1) {
	            System.out.println("A critical hit!");
	            rollDMG = rollDMG + 100;
	        }
	        
	        System.out.println("It did " + rollDMG + " damage!");
	    }
	    
	    return rollDMG;
	}
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] miiParty = {"Mii Fighter", "Mii Warrior", "Mii Cleric", "Mii Mage"};
		String[] boss1 = {"bacon", "cheese", "corn on the cob"};
		String[] boss2 = {"cheeseburger", "creamy stew", "lasagna"};
		String[] boss3 = {"barbeque", "steak", "roast beef"};
		String[] finalBoss = {"birthday cake", "disco ball", "teddy bear", "engagement ring"};
		int[] miiHealth = {140, 120, 100, 80};
		int[] miiMana = {40, 60};
		int boss1Health = 250;
		int boss2Health = 650;
		int boss3Health = 1500;
		int finalBossHealth = 2800;
		
		int userInput = 0;
		int randInt;
		int i;
		
		Main desiredDelay = new Main();
		Main punchDMG = new Main();
		Main kickDMG = new Main();
		Random rand = new Random();
		
		System.out.println("Welcome to TOMODACHI QUEST!");
        
		System.out.println("Your Mii's: ");
		
		desiredDelay.timeDelay(1);
        
		for (i = 0; i < 4; i++) {
		    System.out.println(miiParty[i] + "  HEALTH: " + miiHealth[i]);
		    desiredDelay.timeDelay(1);
		}
		System.out.println("LET THE JOURNEY BEGIN!!");
		
		System.out.println("Press '1' to continue:");
		
		while (userInput != 1)
		    userInput = scnr.nextInt();
		    
		System.out.println("Loading first encounter...");
		System.out.println();
		desiredDelay.timeDelay(3);
		
		randInt = rand.nextInt(3);
		String firstEncounter = boss1[randInt];
		System.out.println("A " + firstEncounter + " appeared!");
		desiredDelay.timeDelay(3);
		
		for (i = 0; i < 4; i++) {
		    if (miiHealth[i] == 0) {
		        System.out.println(miiParty[i] + " is pretending to be dead.");
		        desiredDelay.timeDelay(1);
		    }
		    else {
    		    System.out.println("What will " + miiParty[i] + " do?");
    		    desiredDelay.timeDelay(1);
    		    if (i == 0) {
    		        System.out.println("Press '1' for 'punch', press '2' for 'kick':");
    		        userInput = scnr.nextInt();
    		        if (userInput == 1) {
    		            System.out.println(miiParty[i] + " used punch!");
    		            desiredDelay.timeDelay(1);
    		            boss1Health = boss1Health - punchDMG.calculatePunchDMG();
    		            desiredDelay.timeDelay(1);
    		        }
    		        else if (userInput == 2) {
    		            System.out.println(miiParty[i] + " used kick!");
    		            desiredDelay.timeDelay(1);
    		            boss1Health = boss1Health - kickDMG.calculateKickDMG();
    		            desiredDelay.timeDelay(1);   
    		        }
    		    }
    		    else if (i == 1) {
    		        System.out.println("Press '1' for 'slash', press '2' for 'special attack':");
    		        userInput = scnr.nextInt();
    		        
    		    }
    		    if (boss1Health <= 0) {
    		        System.out.println(firstEncounter + " is defeated!");
    		        break;
    		    }
		    }
		    
		}
		
	}
}

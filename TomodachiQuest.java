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
	        System.out.println("Miss!");
	        return rollDMG = 0;
	    }
	    
	    else {
	        rollDMG = rand.nextInt(11) + 80;
	    
	        rollCrit = rand.nextInt(6);
	        if (rollCrit == 1) {
	            System.out.println("Critical hit!");
	            rollDMG = rollDMG + 100;
	        }
	    }
	    
	    return rollDMG;
	}
	
	public int calculateKickDMG() {
	    int rollHit;
	    int rollCrit;
	    int rollDMG;
	    
	    Random rand = new Random();
	    
	    rollHit = rand.nextInt(4);
	    if (rollHit == 0) {
	        System.out.println("Miss!");
	        return rollDMG = 0;
	    }
	    
	    else {
	        rollDMG = rand.nextInt(11) + 75;
	    
	        rollCrit = rand.nextInt(6);
	        if (rollCrit == 1) {
	            System.out.println("Critical hit!");
	            rollDMG = rollDMG + 100;
	        }
	    }
	    
	    return rollDMG;
	}
	
	public int calculateSlashDMG() {
	    int rollHit;
	    int rollCrit;
	    int rollDMG;
	    
	    Random rand = new Random();
	    
	    rollHit = rand.nextInt(11);
	    if (rollHit == 0) {
	        System.out.println("Miss!");
	        return rollDMG = 0;
	    }
	    
	    else {
	        rollDMG = rand.nextInt(11) + 80;
	    
	        rollCrit = rand.nextInt(4);
	        if (rollCrit == 1) {
	            System.out.println("Critical hit!");
	            rollDMG = rollDMG + 100;
	        }
	    }
	    
	    return rollDMG;
	}
	
	public int calculateSpecialDMG() {
	    int rollHit;
	    int rollCrit;
	    int rollDMG;
	    
	    Random rand = new Random();
	    
	    rollHit = rand.nextInt(4);
	    if (rollHit == 0) {
	        System.out.println("Miss!");
	        return rollDMG = 0;
	    }
	    
	    else {
	        rollDMG = rand.nextInt(51) + 150;
	    
	        rollCrit = rand.nextInt(4);
	        if (rollCrit == 1) {
	            System.out.println("Critical hit!");
	            rollDMG = rollDMG + 100;
	        }
	    }
	    
	    return rollDMG;
	}
	
	public int calculateWeakDMG() {
	    int rollHit;
	    int rollCrit;
	    int rollDMG;
	    
	    Random rand = new Random();
	    
	    rollHit = rand.nextInt(4);
	    if (rollHit == 0) {
	        System.out.println("Miss!");
	        return rollDMG = 0;
	    }
	    
	    else {
	        rollDMG = rand.nextInt(11) + 40;
	    
	        rollCrit = rand.nextInt(6);
	        if (rollCrit == 1) {
	            System.out.println("Critical hit!");
	            rollDMG = rollDMG + 50;
	        }
	    }
	    
	    return rollDMG;
	}
	
	public int calculateSpellDMG() {
	    int rollHit;
	    int rollCrit;
	    int rollDMG;
	    
	    Random rand = new Random();
	    
	    rollHit = rand.nextInt(3);
	    if (rollHit == 0) {
	        System.out.println("Miss!");
	        return rollDMG = 0;
	    }
	    
	    else {
	        rollDMG = rand.nextInt(11) + 180;
	    
	        rollCrit = rand.nextInt(6);
	        if (rollCrit == 1) {
	            System.out.println("Critical hit!");
	            rollDMG = rollDMG + 100;
	        }
	    }
	    
	    return rollDMG;
	}
	
	public int calculateBossDMG() {
	    int rollHit;
	    int rollDMG;
	    
	    Random rand = new Random();
	     
	    rollHit = rand.nextInt(3);
	    if (rollHit == 0) {
	        System.out.println("Miss!");
	        return rollDMG = 0;
	    }
	    
	    else {
	        rollDMG = rand.nextInt(16) + 20;
	    }
	    
	    return rollDMG;
	}
	
	public int calculateFireDMG() {
	    int rollDMG;
	    
	    Random rand = new Random();
	    
	    rollDMG = rand.nextInt(16) + 10;
	    
	    return rollDMG;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] miiParty = {"Mii Fighter", "Mii Warrior", "Mii Cleric", "Mii Mage"};
		String[][] boss = { {"bacon", "cheese", "corn on the cob"}, {"cheeseburger", "creamy stew", "lasagna"}, {"barbeque", "steak", "roast beef"} };
		String[] finalBoss = {"birthday cake", "disco ball", "teddy bear", "engagement ring"};
		int[] miiHealth = {140, 120, 100, 80};
		int[] miiMana = {40, 60};
		int[] bossHealth = {250, 650, 800, 2800};
		
		int userInput = 0;
		int randInt;
		int i;
		int attackDMG = 0;
		int numEncounter = 0;
		int bossType = 0;
		String currEncounter;
		
		Main desiredDelay = new Main();
		Main punchDMG = new Main();
		Main kickDMG = new Main();
		Main slashDMG = new Main();
		Main specialDMG = new Main();
		Main weakDMG = new Main();
		Main spellDMG = new Main();
		Main bossDMG = new Main();
		Main fireDMG = new Main();
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
		    
		while (numEncounter != 4) {
		    if (numEncounter == 0) {
		    System.out.println("Loading first encounter...");
		    System.out.println();
		    desiredDelay.timeDelay(3);
    		}
    		else {
    		    System.out.println("Loading next encounter...");
    		    System.out.println();
    		    desiredDelay.timeDelay(3);
    		}
    		
    		if (numEncounter == 3) {
	            randInt = rand.nextInt(4);
	        }
	        else {
	            randInt = rand.nextInt(3);
	        }
	        
    		bossType = randInt;
    		if (numEncounter == 3) {
    		    currEncounter = finalBoss[bossType];
    		}
    		else {
    		    currEncounter = boss[numEncounter][bossType];
    		}
    		System.out.println(currEncounter + " appeared!");
    		
    		while (bossHealth[numEncounter] > 0) {
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
            		            System.out.println(miiParty[i] + " punched!");
            		            desiredDelay.timeDelay(1);
        						attackDMG = punchDMG.calculatePunchDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
        						}
            		            desiredDelay.timeDelay(1);
            		        }
            		        else if (userInput == 2) {
            		            System.out.println(miiParty[i] + " kicked!");
            		            desiredDelay.timeDelay(1);
        						attackDMG = kickDMG.calculateKickDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
        						}
            		            desiredDelay.timeDelay(1);   
            		        }
            		    }
            		    else if (i == 1) {
            		        System.out.println("Press '1' for 'slash', press '2' for 'special attack':");
            		        userInput = scnr.nextInt();
            		        if (userInput == 1) {
            		            System.out.println(miiParty[i] + " used slash!");
            		            desiredDelay.timeDelay(1);
        						attackDMG = slashDMG.calculateSlashDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
        						}
            		            desiredDelay.timeDelay(1);
            		        }
            		        else if (userInput == 2) {
            		            System.out.println(miiParty[i] + " used special attack!");
            		            desiredDelay.timeDelay(1);
        						attackDMG = specialDMG.calculateSpecialDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
        						}
            		            desiredDelay.timeDelay(1);   
            		        }
            		    }
            		    else if (i == 2) {
            		        System.out.println("Press '1' for 'attack', press '2' for 'heal':");
            		        userInput = scnr.nextInt();
            		        if (userInput == 1) {
            		            System.out.println(miiParty[i] + " attacked!");
            		            desiredDelay.timeDelay(1);
        						attackDMG = weakDMG.calculateWeakDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
        						}
            		            desiredDelay.timeDelay(1);
            		        }
            		        else if (userInput == 2) {
            		            System.out.println(miiParty[i] + " cast Heal!");
            		            desiredDelay.timeDelay(1);
            		            int j;
            		            int healthGained = 0;
            		            int lowestHealth = 200;
            		            int weakestMii = 99;
            		            boolean dmgTaken = false;
            		            
            		            if (miiMana[0] < 10) {
            		                System.out.println("Not enough mana!");
            		                continue;
            		            }
            		            
        						for (j = 0; j < 4; j++) {
        						    if (miiHealth[j] <= 0) {
        						        continue;
        						    }
        						    if (miiHealth[j] < lowestHealth) {
        						        lowestHealth = miiHealth[j];
        						        weakestMii = j;
        						    }
        						}
        						if (weakestMii == 0) {
        						    if (miiHealth[weakestMii] < 140) {
        						        dmgTaken = true;
        						        miiHealth[weakestMii] = miiHealth[weakestMii] + 100;
        						        if (miiHealth[weakestMii] > 140) {
        						            int diff = miiHealth[weakestMii] - 140;
        						            miiHealth[weakestMii] = miiHealth[weakestMii] - diff;
        						            healthGained = 100 - diff;
        						        }
        						        else {
        						            healthGained = 100;
        						        }
        						    }
        						}
        						else if (weakestMii == 1) {
        						    if (miiHealth[weakestMii] < 120) {
        						        dmgTaken = true;
        						        miiHealth[weakestMii] = miiHealth[weakestMii] + 100;
        						        if (miiHealth[weakestMii] > 120) {
        						            int diff = miiHealth[weakestMii] - 120;
        						            miiHealth[weakestMii] = miiHealth[weakestMii] - diff;
        						            healthGained = 100 - diff;
        						        }
        						        else {
        						            healthGained = 100;
        						        }
        						    }
        						}
        						else if (weakestMii == 2) {
        						    if (miiHealth[weakestMii] < 100) {
        						        dmgTaken = true;
        						        miiHealth[weakestMii] = miiHealth[weakestMii] + 100;
        						        if (miiHealth[weakestMii] > 100) {
        						            int diff = miiHealth[weakestMii] - 100;
        						            miiHealth[weakestMii] = miiHealth[weakestMii] - diff;
        						            healthGained = 100 - diff;
        						        }
        						        else {
        						            healthGained = 100;
        						        }
        						    }
        						}
        						else {
        						    if (miiHealth[weakestMii] < 80) {
        						        dmgTaken = true;
        						        miiHealth[weakestMii] = miiHealth[weakestMii] + 100;
        						        if (miiHealth[weakestMii] > 80) {
        						            int diff = miiHealth[weakestMii] - 80;
        						            miiHealth[weakestMii] = miiHealth[weakestMii] - diff;
        						            healthGained = 100 - diff;
        						        }
        						        else {
        						            healthGained = 100;
        						        }
        						    }
        						}
        						if (dmgTaken) {
        						    miiMana[0] = miiMana[0] - 10;
        						    System.out.println(miiParty[weakestMii] + " regained " + healthGained + " health.");
        						}
        						else {
        						    System.out.println("Nothing happened...");
        						}
            		            
            		            desiredDelay.timeDelay(1);   
            		        }
                        }
        		        else {
            		        System.out.println("Press '1' for 'attack', press '2' for 'spell':");
            		        userInput = scnr.nextInt();
            		        if (userInput == 1) {
            		            System.out.println(miiParty[i] + " attacked!");
            		            desiredDelay.timeDelay(1);
        						attackDMG = weakDMG.calculateWeakDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
        						}
            		            desiredDelay.timeDelay(1);
            		        }
            		        else if (userInput == 2) {
            		            System.out.println(miiParty[i] + " cast Spell!");
            		            desiredDelay.timeDelay(1);
        						attackDMG = spellDMG.calculateSpellDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
        						}
        						miiMana[1] = miiMana[1] - 10;
            		            desiredDelay.timeDelay(1);   
            		        }
            		    }
    		        }
    		
        		    if (bossHealth[numEncounter] <= 0) {
        		        System.out.println(currEncounter + " is defeated!");
        		        desiredDelay.timeDelay(1); 
        		        break;
        		    }
    		    }
    		    
    		    if (bossHealth[numEncounter] <= 0) {
    		        System.out.println("Victory!");
    		        desiredDelay.timeDelay(1); 
    		        numEncounter++;
                    break;   
                }
                
    		    boolean isFire = false;
    		    if (numEncounter == 3) {
    		        
    		        randInt = rand.nextInt(2);
    		        
    		        if (randInt == 0) {
    		            System.out.println(currEncounter + " attacked!");
    		            desiredDelay.timeDelay(1);
    		            attackDMG = bossDMG.calculateBossDMG() * 2;
    		        }
    		        else {
    		            isFire = true;
    		        }
    		    }
    		    else {
    		        randInt = rand.nextInt(6);
    		        
    		        if (randInt > 2) {
    		            attackDMG = bossDMG.calculateBossDMG();
    		            System.out.println(currEncounter + " attacked!");
    		            desiredDelay.timeDelay(1);
    		        }
    		        else {
    		            isFire = true;
    		        }
    		    }
    		    
    		    if (isFire) {
    		        for (int k = 0; k < 4; k++) {
    		            if (numEncounter == 3) {
    		                attackDMG = fireDMG.calculateFireDMG() * 2;
    		                System.out.println(currEncounter + " used Fire!");
    		                desiredDelay.timeDelay(1);
    		            }
    		            else {
    		                attackDMG = fireDMG.calculateFireDMG();
    		                System.out.println(currEncounter + " used Fire!");
    		                desiredDelay.timeDelay(1);
    		            }
    		            miiHealth[k] = miiHealth[k] - attackDMG;
    		            System.out.println(miiParty[k] + " recieved " + attackDMG + " damage.");
    		            desiredDelay.timeDelay(1);
    		            
    		            if (miiHealth[k] <= 0) {
    		                System.out.println(miiParty[k] + " pretended to die.");
    		                desiredDelay.timeDelay(1);
    		            }
    		        }
    		    }
    		    else {
    		        randInt = rand.nextInt(4);
    		        
    		        miiHealth[randInt] = miiHealth[randInt] - attackDMG;
    		        System.out.println(miiParty[randInt] + " recieved " + attackDMG + " damage.");
    		            desiredDelay.timeDelay(1);
    		            
    		        if (miiHealth[randInt] <= 0) {
    		            System.out.println(miiParty[randInt] + " pretended to die.");
    		            desiredDelay.timeDelay(1);
    		        }
    		    }
    		    
    		}
		}
		
		
	}
}

import java.util.Scanner;
import java.util.Random;

public class TomodachiQuest
{	
	public void displayHealthAndMana(String[] party, int[] health, int[] maxHealth,int[] mana) {
		for (int i = 0; i < 4; i++) {
			if (health[i] < 0) {
				health[i] = 0;
			}
			System.out.println(party[i] + "  HEALTH: " + health[i] + "/" + maxHealth[i]);
			if (i > 1) {
				System.out.println(party[i] + "  MANA: " + mana[i - 2]);
			}
			System.out.println();
		}
	}
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
		int rollDMG = 0;
		
		Random rand = new Random();
		
		rollHit = rand.nextInt(11);
		if (rollHit == 0) {
			System.out.println("Miss!");
			System.out.println();
			return 0;
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
		int rollDMG = 0;
		
		Random rand = new Random();
		
		rollHit = rand.nextInt(4);
		if (rollHit == 0) {
			System.out.println("Miss!");
			return 0;
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
		int rollDMG = 0;
		
		Random rand = new Random();
		
		rollHit = rand.nextInt(11);
		if (rollHit == 0) {
			System.out.println("Miss!");
			return 0;
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
		int rollDMG = 0;
		
		Random rand = new Random();
		
		rollHit = rand.nextInt(4);
		if (rollHit == 0) {
			System.out.println("Miss!");
			return 0;
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
		int rollDMG = 0;
		
		Random rand = new Random();
		
		rollHit = rand.nextInt(4);
		if (rollHit == 0) {
			System.out.println("Miss!");
			return 0;
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
		int rollDMG = 0;
		
		Random rand = new Random();
		
		rollHit = rand.nextInt(3);
		if (rollHit == 0) {
			System.out.println("Miss!");
			return 0;
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
		int rollDMG = 0;
		
		Random rand = new Random();
		 
		rollHit = rand.nextInt(3);
		if (rollHit == 0) {
			System.out.println("Miss!");
			return 0;
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
		try (Scanner scnr = new Scanner(System.in)) {
		
		String[] miiParty = {"Mii Fighter", "Mii Warrior", "Mii Cleric", "Mii Mage"};
		String[][] boss = { {"bacon", "cheese", "corn on the cob"}, {"cheeseburger", "creamy stew", "lasagna"}, {"barbeque", "steak", "roast beef"} };
		String[] finalBoss = {"birthday cake", "disco ball", "teddy bear", "engagement ring"};
		int[] miiHealth = {140, 120, 100, 80};
		int[] miiMaxHealth = {140, 120, 100, 80};
		int[] miiMana = {40, 60};
		int[] bossHealth = {250, 650, 800, 2800};
		
		int userInput = 0;
		int randInt;
		int i;
		int attackDMG = 0;
		int numEncounter = 0;
		int bossType = 0;
		String currEncounter;
		
		TomodachiQuest displayHeathAndMana = new TomodachiQuest();
		TomodachiQuest desiredDelay = new TomodachiQuest();
		TomodachiQuest punchDMG = new TomodachiQuest();
		TomodachiQuest kickDMG = new TomodachiQuest();
		TomodachiQuest slashDMG = new TomodachiQuest();
		TomodachiQuest specialDMG = new TomodachiQuest();
		TomodachiQuest weakDMG = new TomodachiQuest();
		TomodachiQuest spellDMG = new TomodachiQuest();
		TomodachiQuest bossDMG = new TomodachiQuest();
		TomodachiQuest fireDMG = new TomodachiQuest();
		Random rand = new Random();
		
		System.out.println("Welcome to TOMODACHI QUEST!");

		desiredDelay.timeDelay(1);
        
		System.out.println("Your Mii's: ");
		
		desiredDelay.timeDelay(2);
        
		displayHeathAndMana.displayHealthAndMana(miiParty, miiHealth, miiMaxHealth, miiMana);
		desiredDelay.timeDelay(2);

		System.out.println("LET THE JOURNEY BEGIN!!");
		
		System.out.println("Press '1' to continue:");
		
		while (userInput != 1) {
			userInput = scnr.nextInt();
		}
		    
		while (numEncounter != 4) {
		    if (numEncounter == 0) {
		    System.out.println("Loading first encounter...");
		    System.out.println();
		    desiredDelay.timeDelay(3);
    		}
    		else if (numEncounter < 4){
    		    System.out.println("Loading next encounter...");
    		    System.out.println();
    		    desiredDelay.timeDelay(3);
    		}
    		else {
				System.out.println("Game Over!");
				break;
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
				System.out.println("The final boss " + currEncounter + " appeared!");
    		}
    		else {
    		    currEncounter = boss[numEncounter][bossType];
				System.out.println(currEncounter + " appeared!");
    		}
			desiredDelay.timeDelay(2);
    		
    		while (bossHealth[numEncounter] > 0) {
				System.out.println("Your Miis:");
				System.out.println();
				desiredDelay.timeDelay(2);
				displayHeathAndMana.displayHealthAndMana(miiParty, miiHealth, miiMaxHealth, miiMana);
				System.out.println();
				desiredDelay.timeDelay(2);
    		    for (i = 0; i < 4; i++) {
					if (miiHealth[0] <= 0 && miiHealth[1] <= 0 && miiHealth[2] <= 0 && miiHealth[3] <= 0) {
						System.out.println("All Miis have been defeated...");
						desiredDelay.timeDelay(1);
						System.out.println("Game Over!");
						return;
					}
        		    if (miiHealth[i] <= 0) {
        		        System.out.println(miiParty[i] + " is pretending to be dead.");
						System.out.println();
        		        desiredDelay.timeDelay(1);
						continue;
        		    }
        		    else {


            		    System.out.println("What will " + miiParty[i] + " do?");
            		    desiredDelay.timeDelay(1);
            		    if (i == 0) {
            		        System.out.println("Press '1' for 'punch', press '2' for 'kick':");
            		        userInput = scnr.nextInt();
            		        if (userInput == 1) {
            		            System.out.println(miiParty[i] + " punched!");
								System.out.println();
            		            desiredDelay.timeDelay(2);
        						attackDMG = punchDMG.calculatePunchDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
									System.out.println();
        						}
            		            desiredDelay.timeDelay(1);
            		        }
            		        else if (userInput == 2) {
            		            System.out.println(miiParty[i] + " kicked!");
								System.out.println();
            		            desiredDelay.timeDelay(2);
        						attackDMG = kickDMG.calculateKickDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
									System.out.println();
        						}
            		            desiredDelay.timeDelay(1);   
            		        }
            		    }
            		    else if (i == 1) {
            		        System.out.println("Press '1' for 'slash', press '2' for 'special attack':");
            		        userInput = scnr.nextInt();
            		        if (userInput == 1) {
            		            System.out.println(miiParty[i] + " used slash!");
								System.out.println();
            		            desiredDelay.timeDelay(2);
        						attackDMG = slashDMG.calculateSlashDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
									System.out.println();
        						}
            		            desiredDelay.timeDelay(1);
            		        }
            		        else if (userInput == 2) {
            		            System.out.println(miiParty[i] + " used special attack!");
								System.out.println();
            		            desiredDelay.timeDelay(2);
        						attackDMG = specialDMG.calculateSpecialDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
									System.out.println();
        						}
            		            desiredDelay.timeDelay(1);   
            		        }
            		    }
            		    else if (i == 2) {
            		        System.out.println("Press '1' for 'attack', press '2' for 'heal':");
            		        userInput = scnr.nextInt();
            		        if (userInput == 1) {
            		            System.out.println(miiParty[i] + " attacked!");
								System.out.println();
            		            desiredDelay.timeDelay(2);
        						attackDMG = weakDMG.calculateWeakDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
									System.out.println();
        						}
            		            desiredDelay.timeDelay(1);
            		        }
            		        else if (userInput == 2) {
            		            System.out.println(miiParty[i] + " cast Heal!");
								System.out.println();
            		            desiredDelay.timeDelay(2);
            		            int j;
            		            int healthGained = 0;
            		            int lowestHealth = 200;
            		            int weakestMii = 99;
            		            boolean dmgTaken = false;
            		            
            		            if (miiMana[0] < 10) {
            		                System.out.println("Not enough mana!");
									System.out.println();
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
            		            
								System.out.println();
            		            desiredDelay.timeDelay(2);   
            		        }
                        }
        		        else {
            		        System.out.println("Press '1' for 'attack', press '2' for 'spell':");
            		        userInput = scnr.nextInt();
            		        if (userInput == 1) {
            		            System.out.println(miiParty[i] + " attacked!");
								System.out.println();
            		            desiredDelay.timeDelay(2);
        						attackDMG = weakDMG.calculateWeakDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
									System.out.println();
        						}
            		            desiredDelay.timeDelay(1);
            		        }
            		        else if (userInput == 2) {
            		            System.out.println(miiParty[i] + " cast Spell!");
								System.out.println();
            		            desiredDelay.timeDelay(2);

								if (miiMana[1] < 10) {
            		                System.out.println("Not enough mana!");
									System.out.println();
            		                continue;
            		            }

        						attackDMG = spellDMG.calculateSpellDMG();
            		            bossHealth[numEncounter] = bossHealth[numEncounter] - attackDMG;
        						
        						if (attackDMG > 0) {
        						    System.out.println(currEncounter + " received " + attackDMG + " damage.");
									System.out.println();
        						}
        						miiMana[1] = miiMana[1] - 10;
            		            desiredDelay.timeDelay(1);   
            		        }
            		    }
    		        }
    		
        		    if (bossHealth[numEncounter] <= 0) {
        		        System.out.println(currEncounter + " is defeated!");
        		        desiredDelay.timeDelay(2); 
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
						System.out.println();
    		            desiredDelay.timeDelay(2);
    		            attackDMG = bossDMG.calculateBossDMG();
						if (attackDMG > 0) {
							attackDMG = attackDMG + 15;
						}
    		        }
    		        else {
    		            isFire = true;
    		        }
    		    }
    		    else {
    		        randInt = rand.nextInt(6);
    		        
    		        if (randInt > 2) {
    		            System.out.println(currEncounter + " attacked!");
						System.out.println();
						desiredDelay.timeDelay(2);
						attackDMG = bossDMG.calculateBossDMG();
    		        }
    		        else {
    		            isFire = true;
    		        }
    		    }
    		    
    		    if (isFire) {
					System.out.println(currEncounter + " used Fire!");
					System.out.println();
    		        for (int k = 0; k < 4; k++) {
    		            if (numEncounter == 3) {
    		                attackDMG = fireDMG.calculateFireDMG() + 10;
    		                desiredDelay.timeDelay(1);
    		            }
    		            else {
    		                attackDMG = fireDMG.calculateFireDMG();
    		                desiredDelay.timeDelay(1);
    		            }
						if (miiHealth[k] <= 0) {
							continue;
						}
						else {
							miiHealth[k] = miiHealth[k] - attackDMG;
    		            	System.out.println(miiParty[k] + " recieved " + attackDMG + " damage.");
							System.out.println();
						}
    		            
    		            if (miiHealth[k] <= 0) {
							miiHealth[k] = 0;
    		                System.out.println(miiParty[k] + " pretended to die.");
							System.out.println();
    		            }
    		        }
    		    }
    		    else {
    		        randInt = rand.nextInt(4);
    		        
					while (miiHealth[randInt] <= 0) {
						randInt = rand.nextInt(4);
					}
					if (attackDMG == 0) {
						desiredDelay.timeDelay(1);
					}
					else {
						miiHealth[randInt] = miiHealth[randInt] - attackDMG;
						System.out.println(miiParty[randInt] + " recieved " + attackDMG + " damage.");
						System.out.println();
						desiredDelay.timeDelay(1);
							
						if (miiHealth[randInt] <= 0) {
							System.out.println(miiParty[randInt] + " pretended to die.");
							System.out.println();
							desiredDelay.timeDelay(1);
						}
					}
    		    }
    		    
    		}
		}
		
		
	}
}
}


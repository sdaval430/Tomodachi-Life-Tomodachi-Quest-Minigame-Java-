**Tomodachi Quest Minigame RPG in Java**


This is a personal project in Java that is the product of me reverse-engineering the "Tomodachi Quest" minigame present in the main game of "Tomodachi Life" for the Nintendo 3DS, a game where players can add their Mii 
characters onto an island for them to live and interact in. The minigame itself appears in a Mii's dream sequence where 4 random Miis are selected to form the "party" consisting of different classes based on the Mii's 
personality. The gameplay is very simple as it follows the basic RPG game loop of allowing the player to select different actions for each party member before the enemy can make a move themselves against the party. 
Each Mii has a choice between two moves depending on their class, which do different actions (for example, the "fighter" class has the choice between a "kick" or "punch" move, with their own respective properties and damage).
Considering that not much is known about the innerworkings of the minigame itself (at least from what I could find online), I had to base much of the gameplay off of personal experience and from the gameplay of others online
to gauge the power levels of both the Miis and the bosses. While some stats are known such as the hitpoints/mana value of the miis and the hitpoints of the final boss, all other values such as actual move damage and mini
boss HP were more ambiguous, so I had to come up with my own values that reflected the original game's to the best of my ability. The core gameplay loop is centered around a while loop that checks the HP status of the current boss encounter, which breaks once either the boss is defeated or the entire party is wiped out. After every successful encounter,
the game generates a random encounter from the selection of options in a string array containing the names of several objects. Each encounter progressively becomes more difficult with the boss having more and more HP, but 
their damage output remains the same until the final boss. Within each loop, a for loop iterates through each party member to check their current status (whether they've died or not) and allows the player to perform an
action with each of them. The game ends if all bosses are defeated or the entire party is wiped out.

# NumberGuessingGame
This repository will hold a simple number guessing game in many different languages.

Goal: The Plyaer or Computer has to guess the correct number (picked by the opponent) in 6 guesses.

Does Player or Computer Guess the number 
   1. If Player
       1. Computer picks a random number
       2. Computer asks player to pick a number
       3. Player picks a number
           1. If correct
               1. Display Win Screen
               2. Ask to Play Again
                   1. If yes
                       1. Play Again
                   2. If no
                       1. End Game
           2. If incorrect
               1. If 6th Guess
                   1. Display Loss Screen
                   2. Ask to Play Again
                       1. If yes
                           1. Play Again
                       2. If no
                           1. End Game
               2. If not 6th Guess
                   1. Say lower or higher
                   2. Ask player to pick a new number
   2. If Computer
       1. Computer number pick range is 1-100
       2. Computer prints 50
           1. If second guess
               1. Add 25 if higher, subtract 25 if lower
           2. If third guess
               1. Pick a random number, 12 or 13
               2. Add random if higher, subtract random if lower
           3. If fourth guess
               1. Pick a random number, 6 or 7
               2. Add random if higher, subtract random if lower
           4. If fifth guess
               1. Pick a random number, 3 or 4
               2. Add random if higher, subtract random if lower
       3. Player inputs higher, lower, or equal
           1. If equal game win
           2. If higher or lower, and next guess is number 6, game loss. 
       4. Repeat Step 2.ii and 2.iii untill game win or loss.
       5. Ask to play again. 


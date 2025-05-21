# NumberGuessingGame
This repository will hold a simple number guessing game in many different languages.

Goal: The Plyaer or Computer has to guess the correct number (picked by the opponent) in 6 guesses.
Does Player or Computer Guess the number 
   1. If Player
       1. Computer picks a random number
       2. Computer asks player to pick a number
       C. Player picks a number
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
                           2. End Game
               2. If not 6th Guess
                   1. Say lower or higher
                   2. Ask player to pick a new number
   2. If Computer
       1. Computer number pick range is 1-100
       2. Computer prints 50
           1. If second guess
               1. Add 25 if higher, subtract 25 if lower
           2. If third guess
               1. Add 13 if higher, subtract 13 if lower
           3. If fourth guess
               1. Add 5 if higher, subtract 5 if lower
           4. If fifth guess
               1. Add 3 if higher, subtract 3 if lower
       3. Player inputs higher, lower, or equal
           1. If equal game win
           2. If higher or lower, and next guess is number 6, game loss. 
       4. Repeat Step 2.2 and 2.3 untill game win or loss.
       5. Ask to play again. 
# NumberGuessingGame
This repository will hold a simple number guessing game in many different languages.

#### Goal: The Plyaer or Computer has to guess the correct number (picked by the opponent) in 6 guesses.
#### Does Player or Computer Guess the number 
####    1. If Player
####        A. Computer picks a random number
####        B. Computer asks player to pick a number
####        C. Player picks a number
####            1. If correct
####                A. Display Win Screen
####                B. Ask to Play Again
####                    1. If yes
####                        A. Play Again
####                    2. If no
####                        A. End Game
####            2. If incorrect
####                A. If 6th Guess
####                    1. Display Loss Screen
####                    2. Ask to Play Again
####                        A. If yes
####                            1. Play Again
####                        B. If no
####                            2. End Game
####                B. If not 6th Guess
####                    1. Say lower or higher
####                    2. Ask player to pick a new number
####    2. If Computer
####        A. Computer number pick range is 1-100
####        B. Computer prints 50
####            1. If second guess
####                A. Add 25 if higher, subtract 25 if lower
####            2. If third guess
####                A. Add 13 if higher, subtract 13 if lower
####            3. If fourth guess
####                A. Add 5 if higher, subtract 5 if lower
####            4. If fifth guess
####                A. Add 3 if higher, subtract 3 if lower
####        C. Player inputs higher, lower, or equal
####            1. If equal game win
####            2. If higher or lower, and next guess is number 6, game loss. 
####        D. Repeat Step B and C untill game win or loss.
####        E. Ask to play again. 
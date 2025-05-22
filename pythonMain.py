from random import *


def runPlayer():
    randomNumber = randint(1,100)
    maxGuesses = 5
    i = maxGuesses
    while i > 0:
        pInput = input(f"You have {i} guesses left. Pick a number, 1-100: ")
        if int(pInput) == randomNumber:
            print(f"You have picked the correct number! You've won! It took you {(maxGuesses+1)-i} guesses")
            break
        elif int(pInput) > randomNumber:
            print("lower")
        elif int(pInput) < randomNumber:
            print("higher")

        i -= 1
    
    if i == 0:
        print(f"You lost. The number was {randomNumber}")

def runComputer():
    guessNumber = 50
    highOrLow = {"h":1, "l": -1}
    guesses = 5
    numbers = [25, (12,13), (6,7), (3,4)]
    gameWon = False
    print(f"ok pick a number! \n I have {guesses} guesses. After each guess, tell me higher, lower, or correct")
    for i in range(guesses):
        answer = input(f"Guess {i+1}: {guessNumber}. (h/l/c)").lower()
        if answer == "c": 
            print(f"Yay, I won! it took me {i+1} guesses!")
            gameWon = True
            break
        elif (answer == "h" or answer == "l") and i < 4:
            if type(numbers[i]) == tuple:
                numbers[i] = randint(numbers[i][0], numbers[i][1])
            guessNumber+= numbers[i]*highOrLow[answer]
    if gameWon == False:
        print("Oh no! I lost!")



def Main():
    playAgain = "y"
    while playAgain.lower() == "y":
        pInput = input("Who will guess the number? (Computer/Player): ")
        if pInput.lower() == "player":
            runPlayer()
        elif pInput.lower() == "computer":
            runComputer()
        playAgain = input("Would you like to play agian? y/n ")



Main()

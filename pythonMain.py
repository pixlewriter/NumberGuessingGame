from random import * # type: ignore


def runPlayer():
    randomNumber = randint(1,100)
    print(randomNumber)
    i = 5
    while i > 0:
        pInput = input(f"You have {i} guesses left. Pick a number, 1-100: ")
        if int(pInput) == randomNumber:
            print(f"You have picked the correct number! You've won! It took you {6-i} guesses")
            break
        elif int(pInput) > randomNumber:
            print("lower")
        elif int(pInput) < randomNumber:
            print("higher")

        i -= 1
    
    if i == 0:
        print("You lost")

def runComputer():
    pass

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

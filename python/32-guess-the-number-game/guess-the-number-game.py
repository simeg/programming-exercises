import random

def main():
    print('Let\'s play Guess the Number')
    level = 0

    while level not in [1, 2, 3]:
        try:
            level = int(input('Pick a difficulty level (1, 2, or 3): '))
        except ValueError:
            pass  # Retry until valid input

    number = get_random_number(level)

    guess_count = 0
    guess = int(input('I have my number. What\'s your guess? '))
    while (guess != number):
        if guess > number:
            guess = int(input('Too high. Guess again: '))
        elif guess < number:
            guess = int(input('Too low. Guess again: '))

        guess_count = guess_count + 1

    print('%s' % get_guess_string(guess_count))

    play_again_reply = str(input('Play again? (y/N) ')).lower()
    if play_again_reply == 'y':
        main()
    else:
        print('Goodbye!')


def get_random_number(level):
    max = 0
    if level == 1:
        return random.randint(1, 10)
    elif level == 2:
        return random.randint(1, 100)
    else:
        return random.randint(1, 1000)


def get_guess_string(guess_count):
    if guess_count == 1:
        return 'You\'re a mind reader!'
    if guess_count > 2 and guess_count < 4:
        return 'Most impressive.'
    if guess_count > 3 and guess_count < 6:
        return 'You can do better than that'
    else:
        return 'Better luck next time'


main()


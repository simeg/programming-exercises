from random import randint

answers = [
    'Yes',
    'No',
    'Maybe',
    'Ask again later.'
]

def magic_8_ball():
    input('What\'s your question? ')
    index = randint(0, len(answers) - 1)
    print(answers[index])


magic_8_ball()


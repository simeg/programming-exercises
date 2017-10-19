from random import randint

def picking_a_winner():
    name = 'anything'
    names = []

    while (len(name) > 0):
        name = input('Enter a name: ')
        if len(name) > 0:
            names.append(name)

    index = randint(0, len(names) - 1)

    print('The winner is... %s' % names[index])

picking_a_winner()


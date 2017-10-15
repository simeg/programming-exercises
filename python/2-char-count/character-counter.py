def get_input():
    return input('What is the input string? ').strip()

def character_counter():
    input_str = ''
    while input_str == '':
        input_str = get_input()

    count = 0
    for char in input_str:
        count = count + 1

    print('%s has %d characters' % (input_str, count))

character_counter()


def adding_numbers(max):
    n = 0
    sum = 0
    while (n < max):
        try:
            number = int(input('Enter a number: '))
            sum = number + sum
        except ValueError:
            # Ignore non-numerical inputs
            pass

        n = n + 1

    print('The total is %i.' % sum)

adding_numbers(5)


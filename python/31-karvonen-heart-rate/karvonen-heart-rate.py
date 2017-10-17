import math

def print_heart_rate_row(intensity, heart_rate):
    print(' %s%%\t\t| %s bpm' % (intensity, heart_rate))


def print_table_header():
    print('Intensity\t| Rate')
    print('----------------|--------')


def heart_rate_calculator(resting_pulse, age, intensity):
    return (((220 - age) - resting_pulse) * (intensity / 100)) + resting_pulse


def main():
    resting_pulse = int(input('Resting Pulse: '))
    age = int(input('Age: '))
    intensity = 55

    print_table_header()

    while (intensity <= 95):
        heart_rate = math.floor(heart_rate_calculator(resting_pulse, age, intensity))
        print_heart_rate_row(intensity, heart_rate)
        intensity = intensity + 5


main()


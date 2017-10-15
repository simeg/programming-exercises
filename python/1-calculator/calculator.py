def tip_calculator():
    bill_amount = input('What is the bill amount? ')
    tip_rate = input('What is the tip rate? ')

    bill_amount = float(bill_amount)
    tip_rate = float(tip_rate)

    tip = bill_amount * (tip_rate / 100)
    tip = round(tip, 2)

    total = bill_amount + tip
    total = round(total)

    print('Tip: $%s' % str(tip))
    print('Total: $%s' % str(total))

tip_calculator()


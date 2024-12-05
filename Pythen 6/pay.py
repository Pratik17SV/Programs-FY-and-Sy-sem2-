def computepay(h, r):
    hours = float(h)
    rate = float(r)

    # Calculate gross pay
    if hours <= 40:
        pay = hours * rate
    else:
        regular_hours = 40
        overtime_hours = hours - 40
        pay = (regular_hours * rate) + (overtime_hours * 1.5 * rate)
        return pay

hrs = input("Enter Hours: ")
rate = input("Enter rate: ")
p = computepay(hrs, rate)
print("Pay", p)
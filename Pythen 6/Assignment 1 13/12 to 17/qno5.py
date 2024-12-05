#WAP to demonstrate function with default value.
def fun_defvalue(investment,intrest = 6.8):
    return print("The return on investment is:",(investment*intrest)-investment)
invest = float(input("Enter the investment:"))
fun_defvalue(invest)
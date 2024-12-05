def factorial(num):
    fac =1
    i=1
    while(i<=num):
        fac*=i
        i+=1
    print("the factorial of number",num,"is :",fac)
def armstrong(num):
    str_num = str(num)
    sum = 0
    pow = len(str_num)
    for digit in str_num:
        sum=sum + int(digit)**pow
    if sum == num:
        print("the number is armstrong number.")
    else:
        print("the number is not an armstrong number.")
def pal(num):
    num = str(num)
    if num == num[::-1]:
        print("The number is palidrom number.")
    else:
        print("The number is not a palidrom number.")
n = int(input("Enter the number:"))
factorial(n)
armstrong(n)
pal(n)
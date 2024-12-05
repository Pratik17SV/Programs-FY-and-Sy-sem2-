num = int(input("Enter the number: "))
if num%3==0 or num%5==0 or num%9==0:
    if num%3==0:
        print("The number ",num," is divisible by 3")
    if num%5==0:
        print("The number ",num," is divisible by 5")
    if num%9==0:
        print("The number ",num," is divisible by 9")
else:
    print("The number ",num," is not divisible by 3,5,9")

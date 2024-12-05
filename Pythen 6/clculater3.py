n1=input("Enter the Number1:")
operator=input("Enter the Operator:")
n2=input("Enter the NUmber2:")
n1=int(n1)
n2=int(n2)
if operator == "+":
    print(n1+n2)
elif operator == "-":
    print(n1-n2)
elif operator == "*":
    print(n1*n2)
elif operator == "/":
    print(n1/n2)
elif operator == "%":
    print(n1%n2)         
else:
    print("Invlaid Operation.")   
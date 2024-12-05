a = int(input("Enter the number:"))
b = int(input("Enter the number:"))
c = int(input("Enter the number:"))
if(a>b):
    if(a>c):
        print("The number ",a," is Greater")
    else:
        print("The number ",c," is Greater")
elif(b>c):
    print("The number ",b," is Greater")
else:
    print("The number ",c," is Greater")

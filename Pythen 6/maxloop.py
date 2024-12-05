largest = None
smallest = None
while True:
    num = input("Enter a number: ")
    if num == "done":
        break
    else:
    #catch wrang input
        try:
            n = int(num)
        except:
            print("Invalid input")
            continue
    #finds the smallest number
        if smallest is None:
            smallest=n
        elif smallest>n:
            smallest = n
        #find the largest number
        if largest is None:
            largest = n
        elif largest<n:
            largest = n
print("Maximum is", largest)
print("Minimum is",smallest)
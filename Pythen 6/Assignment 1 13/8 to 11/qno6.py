start = int(input("Enter the starting limit:"))
end = int(input("Enter the ending limit:"))
for num in range(start,end+1,4):
    print(num,end="\t")
print()
print("Reverce order")
for num in range(end - (end - start) %4 , start - 1,-4):
    print(num,end="\t")
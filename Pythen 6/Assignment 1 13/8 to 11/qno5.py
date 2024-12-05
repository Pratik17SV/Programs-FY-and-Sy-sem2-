start = 10
end = 50
print("Multipltes of 3,4and 9 between 10 and 50:")
for num in range(start,end+1):
    if num%3==0 or num%4==0 or num%9==0:
        print(num,end=" ")
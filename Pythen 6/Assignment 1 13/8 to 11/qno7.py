start = 1
end = 30
for num in range(start,end+1):
    if num%5==0:
        print("CLAP",end=" ")
        continue
    print(num,end=" ") 
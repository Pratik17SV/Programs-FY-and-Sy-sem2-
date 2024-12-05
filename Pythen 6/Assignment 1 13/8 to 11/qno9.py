i=1
list1 = list()
while i<=15:
    print("Enter the number",i,":",end="")
    num = int(input())
    if num<0:
        break
    list1.append(num) 
    i+=1
print(list1)
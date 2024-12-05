# dict1 = dict()
# limit = int(input("Enter the limut form user:"))
# for i in range(limit):
#     values = input("Enter the values:")
#     key = input("Enter the key:")
#     dict1[key] = values
# print("dict1:",dict1)

# dict2 = dict()
# for i in range(limit):
#     values = input("Enter the values:")
#     key = input("Enter the key:")
#     dict2[key] = values
# print("dict2:",dict2)

# dict3 = dict()
# dict3 = dict1.copy()
# dict3.update(dict2)
# print("dict3:",dict3)

dict1 = dict()
limit = int(input("Enter the limut form user:"))
for i in range(limit):
    value = int(input("Enter the values:"))
    key = input("Enter the key:")
    dict1[key] = value
print("dict1:",dict1)
sum = 0
for i in dict1.values():
    sum=sum+i
print("the sum is :",sum)
userenter_list=list()
for i in range(7):
    element = input("Enter the Element in list:")
    userenter_list.append(element)
print("list before deliting the elements:",userenter_list)

del userenter_list[5]
del userenter_list[4]
del userenter_list[2]
del userenter_list[0]
print("After deleting the Elements:",userenter_list)

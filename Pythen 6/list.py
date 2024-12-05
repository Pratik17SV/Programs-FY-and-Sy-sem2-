def list_length(list_len1,len_list2):
   for j in list_len1:
       if j in len_list2:
           return True
           break
        
       

list1 = []
n = int(input("Enter the limit:"))
for i in range(n):
    print("Enter the elements 1[",i+1,"]:",end=" ")
    list1.append(input())
list2 = []
for i in range(n):
    print("Enter the elements 2[",i+1,"]:",end=" ")
    list2.append(input())


if list_length(list1,list2):
    print("The element are common.")
else:
    print("The element is not common.")